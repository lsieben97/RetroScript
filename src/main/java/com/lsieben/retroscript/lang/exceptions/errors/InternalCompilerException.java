package com.lsieben.retroscript.lang.exceptions.errors;

import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class InternalCompilerException extends RetroScriptCompilerException {

    public InternalCompilerException(String location, String... arguments) {
        super(location, arguments);
    }
    @Override
    public String getErrorMessage() {
        return "Internal compiler error: $1";
    }

    @Override
    public String getCode() {
        return "000";
    }
}
