package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.visitors.FunctionDefinitionArgumentVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionDefinitionArgumentTest {

    @Test
    void simpleArgument() {
        String code = TestUtils.getFileFromResource("/functionDefinitionArgument/simpleArgument.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        FunctionDefinitionArgument argument = new FunctionDefinitionArgumentVisitor().visitDefinitionArgumentSpec(parser.definitionArgumentSpec());
        assertNotNull(argument, "Argument was not recognized by parser");
        assertEquals(argument.getName(), "test", "Argument does not have test as name.");
        assertEquals(argument.getDataType().getName(), "NUMBER", "Argument does not have NUMBER as type.");
    }
}