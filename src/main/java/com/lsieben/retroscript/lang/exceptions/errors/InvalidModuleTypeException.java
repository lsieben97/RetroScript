package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class InvalidModuleTypeException extends RetroScriptCompilerException {

    public InvalidModuleTypeException(String location, String... arguments) {
        super(location, arguments);
    }

    @Override
    public String getErrorMessage() {
        return "Module $1 is defined with another module type. Location: $2";
    }

    @Override
    public String getCode() {
        return "003";
    }
}
