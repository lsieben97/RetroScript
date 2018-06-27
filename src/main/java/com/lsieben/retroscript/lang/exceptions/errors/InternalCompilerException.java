package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;

public class InternalCompilerException extends vNESCompilerException {

    public InternalCompilerException(String location, String... arguments) {
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
