package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;
import com.lsieben.retroscript.lang.exceptions.warnings.DuplicateReferenceWarning;
import com.lsieben.retroscript.lang.validators.UsingStatementValidator;
import com.lsieben.retroscript.lang.visitors.UsingStatementVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UsingStatementTest {

    @Test
    void simpleUsingStatement() {
        String code = TestUtils.getFileFromResource("/usingStatement/simpleUsingStatement.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        UsingStatement usingStatement = new UsingStatementVisitor().visitUseStatement(parser.useStatement());
        assertNotNull(usingStatement, "Using statement was not recognized by parser");
        assertEquals(usingStatement.getModuleName(), "VNES", "Module ID is not correct");

    }

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