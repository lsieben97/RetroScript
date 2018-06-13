package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.visitors.UsingStatementVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsingStatementTest {

    @Test
    void simpleUsingStatement() {
        String code = TestUtils.getFileFromResource("/usingStatement/simpleUsingStatement.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        UsingStatement usingStatement = new UsingStatementVisitor().visitUseStatement(parser.useStatement());
        assertNotNull(usingStatement, "Using statement was not recognized by parser");
        assertEquals(usingStatement.getModuleName(), "VNES", "Module ID is not correct");

    }
}