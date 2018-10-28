package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;

public class InvalidModuleTypeException extends vNESCompilerException {

    public InvalidModuleTypeException(String location, String... arguments) {
        super(location, arguments);
    }

    @Override
    public String getMessage() {
        return "Module $1 is defined with another module type. Location: $2";
    }

    @Override
    public String getCode() {
        return "003";
    }
}
