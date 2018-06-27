package com.lsieben.retroscript.lang.exceptions.warnings;

import com.lsieben.retroscript.lang.exceptions.vNESWarning;

public class DuplicateReferenceWarning extends vNESWarning {
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
