package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class MissingPropertyException extends RetroScriptCompilerException {

    public MissingPropertyException(String location, String... arguments) {
        super(location, arguments);
    }

    @Override
    public String getErrorMessage() {
        return "Entity $1 is missing mandatory property '$2'";
    }

    @Override
    public String getCode() {
        return "005";
    }
}
