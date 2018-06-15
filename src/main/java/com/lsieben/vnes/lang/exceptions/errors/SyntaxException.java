package com.lsieben.vnes.lang.exceptions.errors;

import com.lsieben.vnes.lang.exceptions.vNESCompilerException;

public class SyntaxException extends vNESCompilerException {

    public SyntaxException(String... arguments) {
        super(arguments);
    }
    @Override
    public String getMessage() {
        return "Syntax error: $1";
    }

    @Override
    public String getCode() {
        return "001";
    }
}
