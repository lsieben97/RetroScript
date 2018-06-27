package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.DataTypeVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTypeTest {
    @Test
    void numberDataType() {
        String code = TestUtils.getFileFromResource("/dataType/number.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        DataType dataType = new DataTypeVisitor().visitDataType(parser.dataType());
        assertNotNull(dataType, "DataType was not recognized by parser");
        assertEquals(dataType.getName(), "NUMBER", "DataType does not have NUMBER as name.");
    }

    @Test
    void idDataType() {
        String code = TestUtils.getFileFromResource("/dataType/id.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        DataType dataType = new DataTypeVisitor().visitDataType(parser.dataType());
        assertNotNull(dataType, "DataType was not recognized by parser");
        assertEquals(dataType.getName(), "ENTITY_NAME", "DataType does not have ENTITY_NAME as name.");
    }

}