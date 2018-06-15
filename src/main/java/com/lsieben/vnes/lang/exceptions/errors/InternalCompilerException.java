package com.lsieben.vnes.lang.exceptions.errors;

import com.lsieben.vnes.lang.exceptions.vNESCompilerException;

public class InternalCompilerException extends vNESCompilerException {

    public InternalCompilerException(String... arguments) {
        super(arguments);
    }
    @Override
    public String getMessage() {
        return "Internal compiler error: $1";
    }

    @Override
    public String getCode() {
        return "000";
    }
}