package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.vnes.lang.exceptions.vNESCompilerException;
import com.lsieben.vnes.lang.exceptions.warnings.DuplicateReferenceWarning;
import com.lsieben.vnes.lang.validators.UsingStatementValidator;
import com.lsieben.vnes.lang.visitors.UsingStatementVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.antlr.v4.runtime.ParserRuleContext;
import org.fusesource.jansi.AnsiRenderer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UsingStatementTest {

    @Test
    void simpleUsingStatement() {
        String code = TestUtils.getFileFromResource("/usingStatement/simpleUsingStatement.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        UsingStatement usingStatement = new UsingStatementVisitor().visitUseStatement(parser.useStatement());
        assertNotNull(usingStatement, "Using statement was not recognized by parser");
        assertEquals(usingStatement.getModuleName(), "VNES", "Module ID is not correct");

    }

    @Test
    void validUsingStatement() throws vNESCompilerException {
        CodeBase codeBase = TestUtils.getCodeBaseForFile("/usingStatement/validUsingStatement.vns");
        UsingStatement usingStatement = codeBase.getSourceFiles().get(0).getUsingStatements().get(0);

        UsingStatementValidator validator = new UsingStatementValidator(usingStatement);
        validator.validate();
    }

    @Test()
    void invalidUsingStatement() {
        CodeBase codeBase = TestUtils.getCodeBaseForFile("/usingStatement/invalidUsingStatement.vns");
        UsingStatement usingStatement = codeBase.getSourceFiles().get(0).getUsingStatements().get(0);

        UsingStatementValidator validator = new UsingStatementValidator(usingStatement);
        assertThrows(ReferenceNotFoundException.class, validator::validate);
    }

    @Test()
    void duplicateUsingStatement() throws vNESCompilerException {
        CodeBase codeBase = TestUtils.getCodeBaseForFile("/usingStatement/duplicateUsingStatement.vns");
        UsingStatement usingStatement = codeBase.getSourceFiles().get(0).getUsingStatements().get(0);

        UsingStatementValidator validator = mock(UsingStatementValidator.class);
        when(validator.getConstruct()).thenReturn(usingStatement);
        doCallRealMethod().when(validator).validate();

        validator.validate();

        verify(validator).makeWarning(any(DuplicateReferenceWarning.class));
    }
}