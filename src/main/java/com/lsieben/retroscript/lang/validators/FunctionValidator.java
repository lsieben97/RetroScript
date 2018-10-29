package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.Function;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class FunctionValidator extends Validator<Function> {
    public FunctionValidator(Function construct) {
        super(construct);
    }

    @Override
    public void validate() throws RetroScriptCompilerException {
        validateSignature();
    }

    private void validateSignature() throws RetroScriptCompilerException {
        getConstruct().getSignature().getValidator().validate();
    }
}
