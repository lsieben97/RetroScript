package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.UsingStatement;
import com.lsieben.retroscript.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;
import com.lsieben.retroscript.lang.exceptions.warnings.DuplicateReferenceWarning;

import java.util.List;

public class UsingStatementValidator extends Validator<UsingStatement> {
    public UsingStatementValidator(UsingStatement construct) {
        super(construct);
    }

    @Override
    public void validate() throws vNESCompilerException {
        checkModuleName();

        checkDuplicateUsingStatement();
    }

    private void checkDuplicateUsingStatement() {
        List<UsingStatement> usingstatementsInSourceFile = getConstruct().getSourceFile().getUsingStatements();
        int count = 0;
        for (UsingStatement usingStatement : usingstatementsInSourceFile) {
            if (usingStatement.getModuleName().equals(getConstruct().getModuleName())) {
                count++;
            }
        }

        if (count > 1) {
            makeWarning(new DuplicateReferenceWarning("USE statement", "USE " + getConstruct().getModuleName()));
        }
    }

    private void checkModuleName() throws vNESCompilerException {
        UsingStatement test = getConstruct();
        if (! getConstruct().getSourceFile().getCodeBase().hasModule(getConstruct().getModuleName())) {
            makeError(new ReferenceNotFoundException("MODULE", getConstruct().getModuleName()));
        }
    }
}
