package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.ArithmeticExpressionComponentVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticExpressionComponentTest {
    @Test
    void addition() {
        String code = TestUtils.getFileFromResource("/arithmeticExpressionComponent/addition.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ArithmeticExpressionComponent arithmeticExpressionComponent = new ArithmeticExpressionComponentVisitor().visitArithmeticExpressionComponent(parser.arithmeticExpressionComponent());
        assertNotNull(arithmeticExpressionComponent, "Arithmetic expression component was not recognized by parser");
        assertNotNull(arithmeticExpressionComponent.getAtom(), "Arithmetic expression component does not have an expression atom.");
        assertEquals(arithmeticExpressionComponent.getOperatorType(), ArithmeticOperatorType.Addition, "Arithmetic expression component does not have Addition as operator type.");
    }

    @Test
    void minus() {
        String code = TestUtils.getFileFromResource("/arithmeticExpressionComponent/minus.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ArithmeticExpressionComponent arithmeticExpressionComponent = new ArithmeticExpressionComponentVisitor().visitArithmeticExpressionComponent(parser.arithmeticExpressionComponent());
        assertNotNull(arithmeticExpressionComponent, "Arithmetic expression component was not recognized by parser");
        assertNotNull(arithmeticExpressionComponent.getAtom(), "Arithmetic expression component does not have an expression atom.");
        assertEquals(arithmeticExpressionComponent.getOperatorType(), ArithmeticOperatorType.Minus, "Arithmetic expression component does not have Minus as operator type.");
    }

    @Test
    void times() {
        String code = TestUtils.getFileFromResource("/arithmeticExpressionComponent/times.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ArithmeticExpressionComponent arithmeticExpressionComponent = new ArithmeticExpressionComponentVisitor().visitArithmeticExpressionComponent(parser.arithmeticExpressionComponent());
        assertNotNull(arithmeticExpressionComponent, "Arithmetic expression component was not recognized by parser");
        assertNotNull(arithmeticExpressionComponent.getAtom(), "Arithmetic expression component does not have an expression atom.");
        assertEquals(arithmeticExpressionComponent.getOperatorType(), ArithmeticOperatorType.Times, "Arithmetic expression component does not have Times as operator type.");
    }

    @Test
    void division() {
        String code = TestUtils.getFileFromResource("/arithmeticExpressionComponent/division.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        ArithmeticExpressionComponent arithmeticExpressionComponent = new ArithmeticExpressionComponentVisitor().visitArithmeticExpressionComponent(parser.arithmeticExpressionComponent());
        assertNotNull(arithmeticExpressionComponent, "Arithmetic expression component was not recognized by parser");
        assertNotNull(arithmeticExpressionComponent.getAtom(), "Arithmetic expression component does not have an expression atom.");
        assertEquals(arithmeticExpressionComponent.getOperatorType(), ArithmeticOperatorType.Division, "Arithmetic expression component does not have Division as operator type.");
    }
}