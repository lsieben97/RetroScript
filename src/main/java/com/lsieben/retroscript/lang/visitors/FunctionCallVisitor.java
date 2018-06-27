package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.Expression;
import com.lsieben.retroscript.lang.constructs.statements.FunctionCall;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionCallVisitor extends RetroScriptBaseVisitor<FunctionCall> {
    @Override
    public FunctionCall visitFunctionCall(RetroScriptParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall(ctx);

        functionCall.setName(ctx.ID().getText());

        List<Expression> arguments = ctx.argumentSpec().stream().map(argument -> argument.accept(new ExpressionVisitor())).collect(Collectors.toList());
        functionCall.setArguments(arguments);

        return functionCall;
    }
}
