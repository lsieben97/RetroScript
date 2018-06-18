package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.vnes.lang.exceptions.vNESCompilerException;
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
        UsingStatement usingStatement = new UsingStatement(new ParserRuleContext());
        usingStatement.setModuleName("VNES");

        UsingStatementValidator validator = mock(UsingStatementValidator.class);
        when(validator.getSourcePositionOfConstruct(usingStatement)).thenReturn("location");
        CodeBase codeBase = mock(CodeBase.class);
        when(codeBase.hasModule("VNES")).thenReturn(false);
        CodeBase.setCurrent(codeBase);
        validator.validate();
    }

    @Test()
    void invalidUsingStatement() {
        UsingStatement usingStatement = new UsingStatement(new ParserRuleContext());
        usingStatement.setModuleName("VNES");

        UsingStatementValidator validator = mock(UsingStatementValidator.class);
        when(validator.getSourcePositionOfConstruct(usingStatement)).thenReturn("location");
        CodeBase codeBase = mock(CodeBase.class);
        when(codeBase.hasModule("VNES")).thenReturn(true);
        CodeBase.setCurrent(codeBase);
        assertThrows(ReferenceNotFoundException.class, validator::validate);
    }
}