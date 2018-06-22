package com.lsieben.vnes.lang.constructs.statements;

import com.lsieben.vnes.lang.constructs.statements.FunctionCall;
import com.lsieben.vnes.lang.visitors.FunctionCallVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionCallTest {
    @Test
    void noArguments() {
        String code = TestUtils.getFileFromResource("/functionCall/noArguments.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        FunctionCall functionCall = new FunctionCallVisitor().visitFunctionCall(parser.functionCall());
        assertNotNull(functionCall, "Function call was not recognized by parser");
        assertEquals(functionCall.getName(), "Test", "Function call does not have Test as name.");
        assertEquals(functionCall.getArguments().size(), 0, "Function call has arguments.");
    }

    @Test
    void oneArgument() {
        String code = TestUtils.getFileFromResource("/functionCall/1Argument.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        FunctionCall functionCall = new FunctionCallVisitor().visitFunctionCall(parser.functionCall());
        assertNotNull(functionCall, "Function call was not recognized by parser");
        assertEquals(functionCall.getName(), "Test", "Function call does not have Test as name.");
        assertEquals(functionCall.getArguments().size(), 1, "Function call has arguments.");
    }

    @Test
    void twoArgument() {
        String code = TestUtils.getFileFromResource("/functionCall/2Arguments.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        FunctionCall functionCall = new FunctionCallVisitor().visitFunctionCall(parser.functionCall());
        assertNotNull(functionCall, "Function call was not recognized by parser");
        assertEquals(functionCall.getName(), "Test", "Function call does not have Test as name.");
        assertEquals(functionCall.getArguments().size(), 2, "Function call has arguments.");
    }
}