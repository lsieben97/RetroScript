package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.ExpressionVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {
    @Test
    void singleAtom() {
        String code = TestUtils.getFileFromResource("/expression/singleAtom.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        Expression expression = new ExpressionVisitor().visitExpression(parser.expression());
        assertNotNull(expression, "Expression was not recognized by parser");
        assertNotNull(expression.getAtom(), "Expression does not have an expression atom.");
        assertEquals(expression.getComponents().size(), 0, "Expression does not have 0 expression atoms.");
    }

    @Test
    void oneArithmeticComponent() {
        String code = TestUtils.getFileFromResource("/expression/1ArithmeticComponent.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        Expression expression = new ExpressionVisitor().visitExpression(parser.expression());
        assertNotNull(expression, "Expression was not recognized by parser");
        assertNotNull(expression.getAtom(), "Expression does not have an expression atom.");
        assertEquals(expression.getComponents().size(), 1, "Expression does not have 1 expression atoms.");
    }

    @Test
    void twoArithmeticComponent() {
        String code = TestUtils.getFileFromResource("/expression/2ArithmeticComponents.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        Expression expression = new ExpressionVisitor().visitExpression(parser.expression());
        assertNotNull(expression, "Expression was not recognized by parser");
        assertNotNull(expression.getAtom(), "Expression does not have an expression atom.");
        assertEquals(expression.getComponents().size(), 2, "Expression does not have 2 expression atoms.");
    }
}