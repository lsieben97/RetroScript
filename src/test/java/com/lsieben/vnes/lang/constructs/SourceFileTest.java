package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.visitors.SourceFileVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SourceFileTest {

    @Test
    void programWithEmptyModule() {
        String code = TestUtils.getFileFromResource("/sourceFile/sourceFileWithEmptyModule.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        SourceFile sourceFile = new SourceFileVisitor().visitSourceFile(parser.sourceFile());
        assertNotNull(sourceFile, "SourceFile was not recognized by parser");
        assertEquals(sourceFile.getModules().size(), 1, "SourceFile does not have module");

    }

    @Test
    void programWithUsingStatement() {
        String code = TestUtils.getFileFromResource("/sourceFile/sourceFileWithUsingStatement.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        SourceFile sourceFile = new SourceFileVisitor().visitSourceFile(parser.sourceFile());
        assertNotNull(sourceFile, "SourceFile was not recognized by parser");
        assertEquals(sourceFile.getUsingStatements().size(), 1, "SourceFile does not have using statement");

    }
}