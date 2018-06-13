package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.visitors.DataTypeVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTypeTest {
    @Test
    void numberDataType() {
        String code = TestUtils.getFileFromResource("/dataType/number.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        DataType dataType = new DataTypeVisitor().visitDataType(parser.dataType());
        assertNotNull(dataType, "DataType was not recognized by parser");
        assertEquals(dataType.getName(), "NUMBER", "DataType does not have NUMBER as name.");
    }

    @Test
    void idDataType() {
        String code = TestUtils.getFileFromResource("/dataType/id.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        DataType dataType = new DataTypeVisitor().visitDataType(parser.dataType());
        assertNotNull(dataType, "DataType was not recognized by parser");
        assertEquals(dataType.getName(), "ENTITY_NAME", "DataType does not have ENTITY_NAME as name.");
    }

}