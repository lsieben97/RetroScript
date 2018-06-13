package com.lsieben.vnes.test_utils;

import com.lsieben.vnes.parser.generated.vNESLexer;
import com.lsieben.vnes.parser.generated.vNESParser;
import org.antlr.v4.runtime.*;
import org.apache.commons.io.IOUtils;

import java.io.IOException;

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
    public static vNESParser getParserForString(String stringToParse) {
        CharStream sourceCode = CharStreams.fromString(stringToParse);
        TokenSource lexer = new vNESLexer(sourceCode);
        TokenStream tokens = new CommonTokenStream(lexer);
        vNESParser parser = new vNESParser(tokens);
        parser.setBuildParseTree(true);
        parser.addErrorListener(new TestErrorListener());
        return parser;
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
