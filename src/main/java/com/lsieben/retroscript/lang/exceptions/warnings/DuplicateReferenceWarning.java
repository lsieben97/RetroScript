package com.lsieben.retroscript.lang.exceptions.warnings;

import com.lsieben.retroscript.lang.exceptions.RetroScriptWarning;

public class DuplicateReferenceWarning extends RetroScriptWarning {
    public DuplicateReferenceWarning(String... arguments) {
        super(arguments);
    }

    @Override
    public String getMessage() {
        return "Duplicate $1: '$2'";
    }

    @Override
    public String getCode() {
        return "201";
    }
}
