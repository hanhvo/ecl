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
package org.eclipse.ecl.editing.tests;

import junit.framework.TestCase;

import org.eclipse.ecl.internal.editing.parser.PegParser;

import com.xored.peg.Block;
import com.xored.peg.PEGParser;

public class PegParserTest extends TestCase {
	PEGParser parser;

	public PegParserTest() {
		parser = PegParser.getParser();
	}

	private void parse(String cmd) {
		Block b = parser.parse(cmd);
		assertFalse(b == Block.NO_PARSE);
	}

	private void check(String cmd, String cmd2) {
		parse(cmd);
	}

	public void testExecSequence() throws Exception {
		parse("TestCommand -hello=1;TestCommand -hello=2;TestCommand -hello=3;");
	}

	public void testExecParallel() throws Exception {
		parse("TestCommand -hello=1&SlowCommand&TestCommand -hello=3;");
	}

	public void testPipeline() throws Exception {
		parse("IncrementCommand|IncrementCommand|IncrementCommand");
	}

	public void testExec1() throws Exception {
		parse("EmitData 42");
	}

	public void testExec2() throws Exception {
		parse("EmitData [EmitData 42]");
	}

	public void testRandom() throws Exception {
		parse("Random 10");
	}

	public void testCommandParam() throws Throwable {
		parse("TestCommandParam {TestEmpty}");
	}

	public void testCompileInDepth01() throws Throwable {
		parse("TestCommandParam {TestCommandParam {TestEmpty}}");
	}

	public void testCompileInDepth02() throws Throwable {
		parse("TestCommandParam {TestCommandParam {TestEmpty}\n"
				+ "TestCommandParam {TestEmpty}}");
	}

	public void testCompileInDepth03() throws Throwable {
		parse("TestCommandParam {TestCommandParam {TestEmpty} |"
				+ "TestCommandParam {TestEmpty}}");
	}

	public void testUnknownParam() throws Throwable {
		parse("TestUnknownParam {TestEmpty}");
	}

	public void testIntParam01() throws Throwable {
		parse("TestIntParam 123");
	}

	public void testIntParam02() throws Throwable {
		parse("TestIntParam str");
	}

	public void testBoolParam01() throws Throwable {
		parse("TestBoolParam true");
	}

	public void testBoolParam02() throws Throwable {
		parse("TestBoolParam");
	}

	public void testParamCollision01() throws Throwable {
		parse("TestParamCollision hello world");
	}

	public void testParamCollision02() throws Throwable {
		parse("TestParamCollision -a1 hello -a2 world");
	}

	public void testOptionalParams01() throws Throwable {
		parse("TestOptionalParams -a1 hello -a2 world");
	}

	public void testOptionalParams02() throws Throwable {
		parse("TestOptionalParams -a1 hello");
	}

	public void testExecParam01() throws Throwable {
		parse("TestIntParam [TestEmpty]");
	}

	public void testLexer001b() throws Throwable {
		check("set1&set2", "(set1&set2)");
		check("(set1&set2)", "(set1&set2)");
	}

	public void testLexer001c() throws Throwable {
		check("set1|set2", "(set1|set2)");
		check("(set1|set2)", "(set1|set2)");
	}

	public void testParser001d() throws Throwable {
		check("set1;set2", "(set1;set2)");
		check("(set1;set2)", "(set1;set2)");
		check("set1;set2;", "(set1;set2)");
	}

	public void testParser001e() throws Throwable {
		check("set1;set2&set3", "(set1;(set2&set3))");
		check("set1;(set2&set3)", "(set1;(set2&set3))");
	}

	public void testParser001f() throws Throwable {
		check("set1&set2;set3", "((set1&set2);set3)");
		check("(set1&set2);set3", "((set1&set2);set3)");
		check("set1&(set2;set3)", "(set1&(set2;set3))");
	}

	public void testParser001g() throws Throwable {
		check("set1|set2&set3", "((set1|set2)&set3)");
		check("(set1|set2)&set3", "((set1|set2)&set3)");
		check("set1|(set2&set3)", "(set1|(set2&set3))");
	}

	public void testParser001h() throws Throwable {
		check("set1&set2|set3", "(set1&(set2|set3))");
		check("set1&set2|set3)", "(set1&(set2|set3))");
	}

	public void testParser002() throws Throwable {
		check("set1 a b c", "set1 a b c");
	}

	public void testParser003() throws Throwable {
		check("set1 c -a b", "set1 c -a=b");
	}

	public void testParser004() throws Throwable {
		check("set1 c --a b", "set1 c -a=b");
	}

	public void testParser005() throws Throwable {
		check("set1 c -a=b", "set1 c -a=b");
	}

	public void testParser006() throws Throwable {
		check("set1 c --a=b", "set1 c -a=b");
	}

	public void testParser007() throws Throwable {
		check("set1 \"C\" --a=b", "set1 C -a=b");
	}

	public void testParser008() throws Throwable {
		check("set1 \"C\" --a={\nb\n}", "set1 C -a=\nb\n");
	}

	public void testParser009() throws Throwable {
		check("set1 a b {\nc\n}", "set1 a b \nc\n");
	}

	public void testParser010() throws Throwable {
		check("set1 a b [set1]", "set1 a b [set1]");
	}

	public void testParser011() throws Throwable {
		check("set1 a b", "set1 a b");
	}

	public void testParser012() throws Throwable {
		check("set1 a b [set1&set2]", "set1 a b [(set1&set2)]");
	}

	public void testParser013() throws Throwable {
		check(
				"http://www.eclipse.org/ecl/tests/model.ecore::TestCommand -hello=world",
				"http://www.eclipse.org/ecl/tests/model.ecore::TestCommand -hello=world");
	}

	public void testParser014() throws Throwable {
		check("A::B::c::TestCommand -hello=world",
				"A::B::c::TestCommand -hello=world");
	}

	public void testParser015() throws Throwable {
		check(
				"ns::TestCommand -hello=1;ns::SlowCommand;ns::TestCommand -hello=3;",
				"(ns::TestCommand -hello=1;ns::SlowCommand;ns::TestCommand -hello=3)");
	}

	public void testParser016() throws Throwable {
		check("cmd ruby:{N.new().format()}", "cmd ruby:{N.new().format()}");
	}

	public void testParser017() throws Throwable {
		check("get-length alfa", "get-length alfa");
	}

	public void testParser018() throws Throwable {
		check("a::b::get-length alfa", "a::b::get-length alfa");
	}
}
