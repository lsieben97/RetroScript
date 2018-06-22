package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.visitors.FunctionVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionTest {
    @Test
    void emptyFunction() {
        String code = TestUtils.getFileFromResource("/function/emptyFunction.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        Function function = new FunctionVisitor().visitFunction(parser.function());
        assertNotNull(function, "Function was not recognized by parser");
        assertEquals(function.getStatements().size(), 0, "Function does not have 0 statements.");
    }

    @Test
    void FunctionWithOneStatement() {
        String code = TestUtils.getFileFromResource("/function/functionWithOneStatement.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        Function function = new FunctionVisitor().visitFunction(parser.function());
        assertNotNull(function, "Function was not recognized by parser");
        assertEquals(function.getStatements().size(), 1, "Function does not have 1 statement.");
    }
}