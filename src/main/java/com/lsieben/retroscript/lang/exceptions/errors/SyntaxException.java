package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class SyntaxException extends RetroScriptCompilerException {

    public SyntaxException(String location, String... arguments) {
        super(location, arguments);
    }
    @Override
    public String getErrorMessage() {
        return "Syntax error: $1";
    }

    @Override
    public String getCode() {
        return "001";
    }
}
