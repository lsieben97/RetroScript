package com.lsieben.retroscript.test_utils;

import com.lsieben.retroscript.lang.constructs.CodeBase;
import com.lsieben.retroscript.lang.constructs.SourceFile;
import com.lsieben.retroscript.lang.visitors.SourceFileVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptLexer;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import org.antlr.v4.runtime.*;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Utils for testing.
 *
 * @since v1.0.0
 * @author Luc Sieben
 */
public class TestUtils {

    /**
     * Get a vNES parser to parse the given string.
     * @param stringToParse The string to parse.
     * @return A vNES parser with the string to parse loaded in.
     *
     * @since v1.0.0
     */
    public static RetroScriptParser getParserForString(String stringToParse) {
        CharStream sourceCode = CharStreams.fromString(stringToParse);
        TokenSource lexer = new RetroScriptLexer(sourceCode);
        TokenStream tokens = new CommonTokenStream(lexer);
        RetroScriptParser parser = new RetroScriptParser(tokens);
        parser.setBuildParseTree(true);
        parser.addErrorListener(new TestErrorListener());
        return parser;
    }

    /**
     * Get a Codebase object for a test resource file.
     * @param fileName The file to load.
     * @return A Codebase object.
     */
    public static CodeBase getCodeBaseForFile(String fileName) {
        RetroScriptParser parser = getParserForString(getFileFromResource(fileName));
        SourceFile sourceFile = new SourceFileVisitor().visitSourceFile(parser.sourceFile());
        CodeBase codeBase = new CodeBase();
        codeBase.setSourceFiles(new ArrayList<>());
        sourceFile.setCodeBase(codeBase);
        codeBase.getSourceFiles().add(sourceFile);
        return codeBase;
    }


    /**
     * Get a string from a resource file.
     * @param fileName The name of the file.
     * @return The contents of the file.
     */
    public static String getFileFromResource(String fileName) {

        String result = "";
        try {
            result = IOUtils.resourceToString(fileName, null);
        } catch (IOException e) {
            fail("Test Resource not found");
        }

        return result;
    }

}
