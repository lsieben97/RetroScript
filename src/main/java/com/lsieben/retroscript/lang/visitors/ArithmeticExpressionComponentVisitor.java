package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.ArithmeticExpressionComponent;
import com.lsieben.retroscript.lang.constructs.ArithmeticOperatorType;
import com.lsieben.retroscript.lang.constructs.ExpressionAtom;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

public class ArithmeticExpressionComponentVisitor extends RetroScriptBaseVisitor<ArithmeticExpressionComponent> {

    @Override
    public ArithmeticExpressionComponent visitArithmeticExpressionComponent(RetroScriptParser.ArithmeticExpressionComponentContext ctx) {
        ArithmeticExpressionComponent component = new ArithmeticExpressionComponent(ctx);
        ExpressionAtom atom = ctx.atom().accept(new ExpressionAtomVisitor());
        atom.setExpressionComponent(component);
        component.setAtom(atom);

        if (ctx.arithmeticOperator().Addition() != null) {
            component.setOperatorType(ArithmeticOperatorType.Addition);
        } else if (ctx.arithmeticOperator().Devision() != null) {
            component.setOperatorType(ArithmeticOperatorType.Division);
        } else if (ctx.arithmeticOperator().Minus() != null) {
            component.setOperatorType(ArithmeticOperatorType.Minus);
        } else if (ctx.arithmeticOperator().Times() != null) {
            component.setOperatorType(ArithmeticOperatorType.Times);
        }

        return component;
    }
}
