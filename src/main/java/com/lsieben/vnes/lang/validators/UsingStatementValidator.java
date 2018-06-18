package com.lsieben.vnes.lang.validators;

import com.lsieben.vnes.lang.constructs.CodeBase;
import com.lsieben.vnes.lang.constructs.UsingStatement;
import com.lsieben.vnes.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.vnes.lang.exceptions.vNESCompilerException;

public class UsingStatementValidator extends Validator<UsingStatement> {
    public UsingStatementValidator(UsingStatement construct) {
        super(construct);
    }

    @Override
    public void validate() throws vNESCompilerException {
        if (! CodeBase.getCurrent().hasModule(construct.getModuleName())) {
            throw new ReferenceNotFoundException(getSourcePositionOfConstruct(construct), "MODULE", construct.getModuleName());
        }
    }

    @Override
    public void validateChildren() throws vNESCompilerException {

    }
}
