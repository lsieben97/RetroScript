package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.SourceFile;
import com.lsieben.retroscript.lang.constructs.UsingStatement;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class SourceFileValidator extends Validator<SourceFile> {

    public SourceFileValidator(SourceFile construct) {
        super(construct);
    }

    @Override
    public void validate() throws RetroScriptCompilerException {
        for (UsingStatement usingStatement : getConstruct().getUsingStatements()) {
            usingStatement.getValidator().validate();
        }
    }
}
