package com.lsieben.retroscript.parser;

import com.lsieben.retroscript.lang.exceptions.errors.InternalCompilerException;
import com.lsieben.retroscript.lang.exceptions.errors.SyntaxException;
import com.lsieben.retroscript.logger.Logger;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

import static org.junit.jupiter.api.Assertions.fail;

public class ErrorListener implements ANTLRErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        Logger.writeError(new SyntaxException(e.getMessage()));
    }

    @Override
    public void reportAmbiguity(org.antlr.v4.runtime.Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {
        Logger.writeError(new InternalCompilerException("Parser ambiguity"));
    }

    @Override
    public void reportAttemptingFullContext(org.antlr.v4.runtime.Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {
        Logger.writeError(new InternalCompilerException("Parser attempting full context"));
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {
        Logger.writeError(new InternalCompilerException("Parser context sensitivity"));
    }
}
