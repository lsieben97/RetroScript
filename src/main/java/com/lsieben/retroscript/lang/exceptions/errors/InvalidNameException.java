package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class InvalidNameException extends RetroScriptCompilerException {

    public InvalidNameException(String location, String... arguments) {
        super(location, arguments);
    }

    @Override
    public String getErrorMessage() {
        return "Invalid name: '$1'. $2";
    }

    @Override
    public String getCode() {
        return "004";
    }
}
