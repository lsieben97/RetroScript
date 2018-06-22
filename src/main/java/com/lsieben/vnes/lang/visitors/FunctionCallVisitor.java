package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.Expression;
import com.lsieben.vnes.lang.constructs.statements.FunctionCall;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallVisitor extends vNESBaseVisitor<FunctionCall> {
    @Override
    public FunctionCall visitFunctionCall(vNESParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall(ctx);

        functionCall.setName(ctx.ID().getText());

        List<Expression> arguments = ctx.argumentSpec().stream().map(argument -> argument.accept(new ExpressionVisitor())).collect(Collectors.toList());
        functionCall.setArguments(arguments);

        return functionCall;
    }
}
