/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Yuri Strot)
 *******************************************************************************/
package org.eclipse.ecl.internal.debug;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.ISessionListener;
import org.eclipse.ecl.core.SessionListenerManager;
import org.eclipse.ecl.debug.BreakpointEvent;
import org.eclipse.ecl.debug.BreakpointHitEvent;
import org.eclipse.ecl.debug.Event;
import org.eclipse.ecl.debug.EventType;
import org.eclipse.ecl.debug.StepEndEvent;
import org.eclipse.ecl.debug.SuspendEvent;
import org.eclipse.ecl.debug.commands.DebugCommand;
import org.eclipse.ecl.debug.model.StackData;
import org.eclipse.ecl.gen.ast.AstExec;
import org.eclipse.emf.ecore.EObject;

public class ServerSession extends Session implements ISessionListener {

	public ServerSession(Socket socket, String id) throws IOException {
		super(socket);
		this.id = id;
		SessionListenerManager.addListener(this);
		request(new Event(EventType.STARTED));
	}

	public void close() {
		SessionListenerManager.removeListener(this);
		super.close();
	}

	@Override
	public void beginCommand(Command command) {
		try {
			StackData[] data = getStack(command);
			if (data != null) {
				CountDownLatch latch = getIfLocked();
				if (latch != null) {
					if (step) {
						request(new StepEndEvent(data));
					} else {
						request(new SuspendEvent(data));
					}
					latch.await();
				} else if (isHitBreakpoint(data[0])) {
					this.latch = new CountDownLatch(1);
					request(new BreakpointHitEvent(data));
					this.latch.await();
				}
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	private boolean isHitBreakpoint(StackData data) {
		String file = data.getFile();
		Set<Integer> lines = breakpoints.get(file);
		if (lines != null) {
			return lines.contains(data.getLine());
		}
		return false;
	}

	@Override
	public void endCommand(Command command, IStatus status) {
	}

	@Override
	public void request(Event event) {
		System.out.println("[server] -> " + event);
		super.request(event);
	}

	@Override
	protected void handle(Event event) {
		System.out.println("[server] <- " + event);
		switch (event.getType()) {
		case SUSPEND:
			suspend();
			break;
		case RESUME:
			resume();
			break;
		case STEP:
			step();
			break;
		case BREAKPOINT_ADD:
			addBreakpoint((BreakpointEvent) event);
			break;
		case BREAKPOINT_REMOVE:
			removeBreakpoint((BreakpointEvent) event);
			break;
		default:
			throw new IllegalArgumentException("Unexpected request: " + event);
		}
	}

	private StackData[] getStack(Command command) {
		AstExec source = getSourceInfo(command);
		// looking only for command with source info
		if (source == null) {
			return null;
		}
		DebugCommand debug = getRoot(command);
		if (debug == null || !id.equals(debug.getSession())) {
			// another session
			return null;
		}
		StackData data = new StackData(debug.getPath(), source.getName(),
				source.getLine());
		return new StackData[] { data };
	}

	private AstExec getSourceInfo(Command command) {
		if (command instanceof AstExec) {
			return (AstExec) command;
		}
		return null;
	}

	private static DebugCommand getRoot(Command command) {
		do {
			if (command instanceof DebugCommand) {
				return (DebugCommand) command;
			}
			command = getParent(command);
		} while (command != null);
		return null;
	}

	private static Command getParent(Command command) {
		EObject container = command.eContainer();
		if (container instanceof Command) {
			return (Command) container;
		}
		return null;
	}

	private synchronized void suspend() {
		if (getIfLocked() == null) {
			latch = new CountDownLatch(1);
		}
	}

	private synchronized void resume() {
		step = false;
		latch.countDown();
		request(new Event(EventType.RESUMED));
	}

	private synchronized void step() {
		step = true;
		latch.countDown();
		latch = new CountDownLatch(1);
	}

	private void addBreakpoint(BreakpointEvent event) {
		Set<Integer> set = breakpoints.get(event.getPath());
		if (set == null) {
			set = new HashSet<Integer>();
			breakpoints.put(event.getPath(), set);
		}
		set.add(event.getLine());
	}

	private void removeBreakpoint(BreakpointEvent event) {
		Set<Integer> set = breakpoints.get(event.getPath());
		if (set != null) {
			set.remove(event.getLine());
		}
		if (set.isEmpty()) {
			breakpoints.remove(event.getPath());
		}
	}

	private synchronized CountDownLatch getIfLocked() {
		if (latch.getCount() > 0) {
			return latch;
		}
		return null;
	}

	private boolean step = false;

	private final String id;
	private CountDownLatch latch = new CountDownLatch(1);
	private final Map<String, Set<Integer>> breakpoints = new HashMap<String, Set<Integer>>();

}
