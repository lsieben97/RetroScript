package com.lsieben.vnes.lang.exceptions.errors;

import com.lsieben.vnes.lang.exceptions.vNESCompilerException;

public class ReferenceNotFoundException extends vNESCompilerException {

    public ReferenceNotFoundException(String location, String... arguments) {
        super(location, arguments);
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
