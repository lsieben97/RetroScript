package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.FunctionDefinitionArgumentVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionDefinitionArgumentTest {

    @Test
    void simpleArgument() {
        String code = TestUtils.getFileFromResource("/functionDefinitionArgument/simpleArgument.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        FunctionDefinitionArgument argument = new FunctionDefinitionArgumentVisitor().visitDefinitionArgumentSpec(parser.definitionArgumentSpec());
        assertNotNull(argument, "Argument was not recognized by parser");
        assertEquals(argument.getName(), "test", "Argument does not have test as name.");
        assertEquals(argument.getDataType().getName(), "NUMBER", "Argument does not have NUMBER as type.");
    }
}