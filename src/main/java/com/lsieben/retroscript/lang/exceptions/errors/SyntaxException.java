package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;

public class SyntaxException extends vNESCompilerException {

    public SyntaxException(String location, String... arguments) {
        super(location, arguments);
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
