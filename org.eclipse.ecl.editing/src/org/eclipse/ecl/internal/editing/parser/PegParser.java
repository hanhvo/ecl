/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.internal.editing.parser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ecl.editing.EclEditingPlugin;

import com.xored.peg.Block;
import com.xored.peg.PEGParser;
import com.xored.peg.ParsingExpressionGrammar;
import com.xored.peg.ParsingGrammar;
import com.xored.peg.TreeOptimizer;

public class PegParser {
	static PEGParser parser = null;

	public static String getNameByType(int type) {
		return getParser().getGrammar().getNameByType(type);
	}

	public static PEGParser getParser() {
		if (parser == null) {
			String grammarText = null;
			try {
				grammarText = EclEditingPlugin.readFile("grammar/Ecl.g");
			} catch (Exception e) {
				// Could not happen
			}
			PEGParser tempParser = new PEGParser(new ParsingExpressionGrammar());
			Block block = tempParser.parse(grammarText);
			ParsingGrammar grammar = new ParsingGrammar(block, true);
			parser = new PEGParser(grammar);
		}
		return parser;
	}

	public static Block parse(String text) {
		Block b = getParser().parse(text);
		TreeOptimizer.removeEmpty(b);
		ParsingGrammar grammar = getParser().getGrammar();
		TreeOptimizer.removeChildrenOfType(b, grammar.getTypeByName("host"));
		TreeOptimizer.removeChildrenOfType(b, grammar
				.getTypeByName("command_name"));
		TreeOptimizer.removeChildrenOfType(b, grammar
				.getTypeByName("argument_value"));
		TreeOptimizer.removeChildrenOfType(b, grammar
				.getTypeByName("argument_name"));
		return b;
	}

	public static Block findBlock(Block block, int offset) {
		if (block.getBegin() <= offset && block.getEnd() >= offset) {
			int num = block.getNumChildren();
			if (num == 0)
				return block;
			for (int i = 0; i < num; i++) {
				Block child = block.getChild(i);
				Block res = findBlock(child, offset);
				if (res != null) {
					return res;
				}
			}
		}
		return null;
	}

	public static String findCommand(Block block, int offset) {
		if (block.getBegin() <= offset && block.getEnd() >= offset) {
			if ("cmd".equals(PegParser.getNameByType(block.getType()))) {
				Block name = block.getChild(0);
				return name == null ? null : name.getSubtext();
			}
			int num = block.getNumChildren();
			for (int i = 0; i < num; i++) {
				Block child = block.getChild(i);
				String res = findCommand(child, offset);
				if (res != null) {
					return res;
				}
			}
		}
		return null;
	}

	public static List<String> findParams(Block block, int offset) {
		if (block.getBegin() <= offset && block.getEnd() >= offset) {
			if ("cmd".equals(PegParser.getNameByType(block.getType()))) {
				List<String> names = new ArrayList<String>();
				collectParams(block, offset, names);
				return names;
			}
			int num = block.getNumChildren();
			for (int i = 0; i < num; i++) {
				Block child = block.getChild(i);
				List<String> res = findParams(child, offset);
				if (res != null) {
					return res;
				}
			}
		}
		return null;
	}

	private static void collectParams(Block block, int offset, List<String> list) {
		if ("argument_name".equals(PegParser.getNameByType(block.getType()))) {
			if (block.getBegin() > offset || block.getEnd() < offset) {
				list.add(block.getSubtext());
			}
		}
		int num = block.getNumChildren();
		for (int i = 0; i < num; i++) {
			Block child = block.getChild(i);
			collectParams(child, offset, list);
		}
	}
}
