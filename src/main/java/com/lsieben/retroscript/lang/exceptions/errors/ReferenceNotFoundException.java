package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;

public class ReferenceNotFoundException extends vNESCompilerException {

    public ReferenceNotFoundException(String location, String... arguments) {
        super(arguments);
    }

    @Override
    public String getMessage() {
        return "Could not find $1 '$2'";
    }

    @Override
    public String getCode() {
        return "002";
    }
}
