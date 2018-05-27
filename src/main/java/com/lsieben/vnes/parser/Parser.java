package com.lsieben.vnes.parser;

import com.lsieben.vnes.lang.constructs.SourceFile;
import com.lsieben.vnes.lang.visitors.SourceFileVisitor;
import com.lsieben.vnes.logger.Logger;
import com.lsieben.vnes.parser.generated.vNESLexer;
import com.lsieben.vnes.parser.generated.vNESParser;
import org.antlr.v4.runtime.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Parser {
    public static SourceFile parseFile(File file) {
        CharStream sourceCode = null;
        try {
             sourceCode = CharStreams.fromReader(new FileReader(file));
        } catch (IOException ex) {
            Logger.writeError("Cannot read source file '" + file.getPath() + "': " + ex.getMessage());
        }

        TokenSource lexer = new vNESLexer(sourceCode);
        TokenStream tokens = new CommonTokenStream(lexer);
        vNESParser parser = new vNESParser(tokens);
        parser.setBuildParseTree(true);
        return new SourceFileVisitor().visit(parser.sourceFile());
    }
}
