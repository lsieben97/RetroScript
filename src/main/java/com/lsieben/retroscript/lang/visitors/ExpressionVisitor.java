package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.ArithmeticExpressionComponent;
import com.lsieben.retroscript.lang.constructs.Expression;
import com.lsieben.retroscript.lang.constructs.ExpressionAtom;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

import java.util.List;
import java.util.stream.Collectors;

public class ExpressionVisitor extends RetroScriptBaseVisitor<Expression> {
    @Override
    public Expression visitExpression(RetroScriptParser.ExpressionContext ctx) {
        Expression expression = new Expression(ctx);
        ExpressionAtom atom = ctx.atom().accept(new ExpressionAtomVisitor());
        atom.setExpression(expression);
        expression.setAtom(atom);

        List<ArithmeticExpressionComponent> components = ctx.arithmeticExpressionComponent().stream().map(component -> component.accept(new ArithmeticExpressionComponentVisitor())).collect(Collectors.toList());

        for (ArithmeticExpressionComponent component : components) {
            component.setExpression(expression);
        }

        expression.setComponents(components);

        return expression;
    }
}
