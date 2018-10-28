package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.FunctionVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {
    @Test
    void emptyFunction() {
        String code = TestUtils.getFileFromResource("/function/emptyFunction.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        Function function = new FunctionVisitor().visitFunction(parser.function());
        assertNotNull(function, "Function was not recognized by parser");
        assertEquals(function.getStatements().size(), 0, "Function does not have 0 statements.");
    }

    @Test
    void FunctionWithOneStatement() {
        String code = TestUtils.getFileFromResource("/function/functionWithOneStatement.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        Function function = new FunctionVisitor().visitFunction(parser.function());
        assertNotNull(function, "Function was not recognized by parser");
        assertEquals(function.getStatements().size(), 1, "Function does not have 1 statement.");
    }
}