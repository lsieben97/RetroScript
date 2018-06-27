package com.lsieben.vnes.lang.validators;

import com.lsieben.vnes.lang.constructs.SourceFile;
import com.lsieben.vnes.lang.constructs.UsingStatement;
import com.lsieben.vnes.lang.exceptions.vNESCompilerException;

public class SourceFileValidator extends Validator<SourceFile> {

    public SourceFileValidator(SourceFile construct) {
        super(construct);
    }

    @Override
    public void validate() throws vNESCompilerException {
        for (UsingStatement usingStatement : getConstruct().getUsingStatements()) {
            usingStatement.getValidator().validate();
        }
    }
}
