package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.SourceFileVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SourceFileTest {

    @Test
    void programWithEmptyModule() {
        String code = TestUtils.getFileFromResource("/sourceFile/sourceFileWithEmptyModule.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        SourceFile sourceFile = new SourceFileVisitor().visitSourceFile(parser.sourceFile());
        assertNotNull(sourceFile, "SourceFile was not recognized by parser");
        assertEquals(sourceFile.getModules().size(), 1, "SourceFile does not have module");

    }

    @Test
    void programWithUsingStatement() {
        String code = TestUtils.getFileFromResource("/sourceFile/sourceFileWithUsingStatement.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        SourceFile sourceFile = new SourceFileVisitor().visitSourceFile(parser.sourceFile());
        assertNotNull(sourceFile, "SourceFile was not recognized by parser");
        assertEquals(sourceFile.getUsingStatements().size(), 1, "SourceFile does not have using statement");

    }

    @Test
    void emptySourceFile() {
        String code = TestUtils.getFileFromResource("/sourceFile/emptySourceFile.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        SourceFile sourceFile = new SourceFileVisitor().visitSourceFile(parser.sourceFile());
        assertNotNull(sourceFile, "SourceFile was not recognized by parser");
    }
}