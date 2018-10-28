package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.Function;
import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;

public class FunctionValidator extends Validator<Function> {
    public FunctionValidator(Function construct) {
        super(construct);
    }

    @Override
    public void validate() throws vNESCompilerException {
        validateSignature();
    }

    private void validateSignature() throws vNESCompilerException {
        getConstruct().getSignature().getValidator().validate();
    }
}
