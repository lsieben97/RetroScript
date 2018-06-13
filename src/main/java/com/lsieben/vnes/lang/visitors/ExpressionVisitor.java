package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.ArithmeticExpressionComponent;
import com.lsieben.vnes.lang.constructs.Expression;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

import java.util.List;
import java.util.stream.Collectors;

public class ExpressionVisitor extends vNESBaseVisitor<Expression> {
    @Override
    public Expression visitExpression(vNESParser.ExpressionContext ctx) {
        Expression expression = new Expression(ctx);

        expression.setAtom(ctx.atom().accept(new ExpressionAtomVisitor()));

        List<ArithmeticExpressionComponent> components = ctx.arithmeticExpressionComponent().stream().map(component -> component.accept(new ArithmeticExpressionComponentVisitor())).collect(Collectors.toList());
        expression.setComponents(components);

        return expression;
    }
}
