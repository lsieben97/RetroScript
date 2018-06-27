package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.statements.ReturnStatement;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

public class ReturnStatementVisitor extends RetroScriptBaseVisitor<ReturnStatement> {
    @Override
    public ReturnStatement visitReturnStatement(RetroScriptParser.ReturnStatementContext ctx) {
        ReturnStatement returnStatement = new ReturnStatement(ctx);
        returnStatement.setExpression(ctx.expression().accept(new ExpressionVisitor()));
        return returnStatement;
    }
}
