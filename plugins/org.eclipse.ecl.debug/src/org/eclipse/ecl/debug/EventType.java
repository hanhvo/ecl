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
package org.eclipse.ecl.debug;

public enum EventType {

	SUSPEND,

	RESUME,

	STEP,

	BREAKPOINT_ADD(true),

	BREAKPOINT_REMOVE(true),

	STARTED,

	SUSPENDED(true),

	STEP_ENDED(true),

	BREAKPOINT_HIT(true),

	RESUMED,

	TERMINATED;

	public boolean isExtended() {
		return extended;
	}

	private EventType() {
		this(false);
	}

	private EventType(boolean extended) {
		this.extended = extended;
	}

	private boolean extended;

}
