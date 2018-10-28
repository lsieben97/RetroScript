package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;

public class InvalidNameException extends vNESCompilerException {

    public InvalidNameException(String location, String... arguments) {
        super(location, arguments);
    }

    @Override
    public String getMessage() {
        return "Invalid name: '$1'. $2";
    }

    @Override
    public String getCode() {
        return "004";
    }
}
