package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.ExpressionAtomVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionAtomTest {

    @Test
    void ID() {
        String code = TestUtils.getFileFromResource("/expressionAtom/id.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ExpressionAtom atom = new ExpressionAtomVisitor().visitAtom(parser.atom());
        assertNotNull(atom, "Expression atom was not recognized by parser");
        assertEquals(atom.getType().getName(), "ID", "Expression atom does not have ID as type.");
        assertEquals(atom.getId(), "Test", "Expression atom does not have Test as value");
    }

    @Test
    void NUMBER() {
        String code = TestUtils.getFileFromResource("/expressionAtom/number.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ExpressionAtom atom = new ExpressionAtomVisitor().visitAtom(parser.atom());
        assertNotNull(atom, "Expression atom was not recognized by parser");
        assertEquals(atom.getType().getName(), "NUMBER", "Expression atom does not have NUMBER as type.");
        assertEquals(atom.getInteger(), 3, "Expression atom does not have 3 as value");
    }

    @Test
    void STRING() {
        String code = TestUtils.getFileFromResource("/expressionAtom/string.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ExpressionAtom atom = new ExpressionAtomVisitor().visitAtom(parser.atom());
        assertNotNull(atom, "Expression atom was not recognized by parser");
        assertEquals(atom.getType().getName(), "STRING", "Expression atom does not have STRING as type.");
        assertEquals(atom.getString(), "Test", "Expression atom does not have Test as value");
    }

    @Test
    void FUNCTION() {
        String code = TestUtils.getFileFromResource("/expressionAtom/function.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ExpressionAtom atom = new ExpressionAtomVisitor().visitAtom(parser.atom());
        assertNotNull(atom, "Expression atom was not recognized by parser");
        assertEquals(atom.getType().getName(), "FUNCTION", "Expression atom does not have FUNCTION as type.");
        assertNotNull(atom.getFunctionCall(), "Expression atom does not have a method call.");
    }

    @Test
    void TRUE() {
        String code = TestUtils.getFileFromResource("/expressionAtom/TRUE.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ExpressionAtom atom = new ExpressionAtomVisitor().visitAtom(parser.atom());
        assertNotNull(atom, "Expression atom was not recognized by parser");
        assertEquals(atom.getType().getName(), "BOOLEAN", "Expression atom does not have BOOLEAN as type.");
        assertEquals(atom.getBooleanValue(), true, "Expression atom does not have TRUE as value.");
    }

    @Test
    void FALSE() {
        String code = TestUtils.getFileFromResource("/expressionAtom/FALSE.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ExpressionAtom atom = new ExpressionAtomVisitor().visitAtom(parser.atom());
        assertNotNull(atom, "Expression atom was not recognized by parser");
        assertEquals(atom.getType().getName(), "BOOLEAN", "Expression atom does not have BOOLEAN as type.");
        assertEquals(atom.getBooleanValue(), false, "Expression atom does not have a FALSE as value.");
    }
}