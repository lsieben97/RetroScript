package com.lsieben.retroscript.parser;

import com.lsieben.retroscript.lang.constructs.SourceFile;
import com.lsieben.retroscript.lang.visitors.SourceFileVisitor;
import com.lsieben.retroscript.logger.Logger;
import com.lsieben.retroscript.parser.generated.RetroScriptLexer;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
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

        TokenSource lexer = new RetroScriptLexer(sourceCode);
        TokenStream tokens = new CommonTokenStream(lexer);
        RetroScriptParser parser = new RetroScriptParser(tokens);
        parser.setBuildParseTree(true);
        parser.addErrorListener(new ErrorListener());
        return new SourceFileVisitor().visit(parser.sourceFile());
    }
}
