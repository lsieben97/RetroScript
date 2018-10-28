package com.lsieben.retroscript.lang.constructs.statements;

import com.lsieben.retroscript.lang.visitors.FunctionCallVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionCallTest {
    @Test
    void noArguments() {
        String code = TestUtils.getFileFromResource("/functionCall/noArguments.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        FunctionCall functionCall = new FunctionCallVisitor().visitFunctionCall(parser.functionCall());
        assertNotNull(functionCall, "Function call was not recognized by parser");
        assertEquals(functionCall.getName(), "Test", "Function call does not have Test as name.");
        assertEquals(functionCall.getArguments().size(), 0, "Function call has arguments.");
    }

    @Test
    void oneArgument() {
        String code = TestUtils.getFileFromResource("/functionCall/1Argument.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        FunctionCall functionCall = new FunctionCallVisitor().visitFunctionCall(parser.functionCall());
        assertNotNull(functionCall, "Function call was not recognized by parser");
        assertEquals(functionCall.getName(), "Test", "Function call does not have Test as name.");
        assertEquals(functionCall.getArguments().size(), 1, "Function call has arguments.");
    }

    @Test
    void twoArgument() {
        String code = TestUtils.getFileFromResource("/functionCall/2Arguments.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        FunctionCall functionCall = new FunctionCallVisitor().visitFunctionCall(parser.functionCall());
        assertNotNull(functionCall, "Function call was not recognized by parser");
        assertEquals(functionCall.getName(), "Test", "Function call does not have Test as name.");
        assertEquals(functionCall.getArguments().size(), 2, "Function call has arguments.");
    }
}