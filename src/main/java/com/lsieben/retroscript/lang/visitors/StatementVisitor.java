package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.statements.Statement;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

public class StatementVisitor extends RetroScriptBaseVisitor<Statement> {
    @Override
    public Statement visitStatement(RetroScriptParser.StatementContext ctx) {
        Statement statement = null;

        if (ctx.functionCall() != null) {
            statement = ctx.functionCall().accept(new FunctionCallVisitor());
        } else if (ctx.returnStatement() != null) {
            statement = ctx.returnStatement().accept(new ReturnStatementVisitor());
        }
        return statement;
    }
}
