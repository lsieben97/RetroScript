package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.CodeBase;
import com.lsieben.retroscript.lang.constructs.UsingStatement;
import com.lsieben.retroscript.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;
import com.lsieben.retroscript.lang.exceptions.warnings.DuplicateReferenceWarning;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

class UsingStatementValidatorTest {
    @Test
    void validUsingStatement() throws vNESCompilerException {
        CodeBase codeBase = TestUtils.getCodeBaseForFile("/usingStatement/validUsingStatement.rsf");
        UsingStatement usingStatement = codeBase.getSourceFiles().get(0).getUsingStatements().get(0);

        UsingStatementValidator validator = new UsingStatementValidator(usingStatement);
        validator.validate();
    }

    @Test()
    void invalidUsingStatement() {
        CodeBase codeBase = TestUtils.getCodeBaseForFile("/usingStatement/invalidUsingStatement.rsf");
        UsingStatement usingStatement = codeBase.getSourceFiles().get(0).getUsingStatements().get(0);

        UsingStatementValidator validator = new UsingStatementValidator(usingStatement);
        assertThrows(ReferenceNotFoundException.class, validator::validate);
    }

    @Test()
    void duplicateUsingStatement() throws vNESCompilerException {
        CodeBase codeBase = TestUtils.getCodeBaseForFile("/usingStatement/duplicateUsingStatement.rsf");
        UsingStatement usingStatement = codeBase.getSourceFiles().get(0).getUsingStatements().get(0);

        UsingStatementValidator validator = mock(UsingStatementValidator.class);
        when(validator.getConstruct()).thenReturn(usingStatement);
        doCallRealMethod().when(validator).validate();

        validator.validate();

        verify(validator).makeWarning(any(DuplicateReferenceWarning.class));
    }
}