package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.visitors.ExpressionVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionTest {
    @Test
    void singleAtom() {
        String code = TestUtils.getFileFromResource("/expression/singleAtom.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        Expression expression = new ExpressionVisitor().visitExpression(parser.expression());
        assertNotNull(expression, "Expression was not recognized by parser");
        assertNotNull(expression.getAtom(), "Expression does not have an expression atom.");
        assertEquals(expression.getComponents().size(), 0, "Expression does not have 0 expression atoms.");
    }

    @Test
    void oneArithmeticComponent() {
        String code = TestUtils.getFileFromResource("/expression/1ArithmeticComponent.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        Expression expression = new ExpressionVisitor().visitExpression(parser.expression());
        assertNotNull(expression, "Expression was not recognized by parser");
        assertNotNull(expression.getAtom(), "Expression does not have an expression atom.");
        assertEquals(expression.getComponents().size(), 1, "Expression does not have 1 expression atoms.");
    }

    @Test
    void twoArithmeticComponent() {
        String code = TestUtils.getFileFromResource("/expression/2ArithmeticComponents.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        Expression expression = new ExpressionVisitor().visitExpression(parser.expression());
        assertNotNull(expression, "Expression was not recognized by parser");
        assertNotNull(expression.getAtom(), "Expression does not have an expression atom.");
        assertEquals(expression.getComponents().size(), 2, "Expression does not have 2 expression atoms.");
    }
}