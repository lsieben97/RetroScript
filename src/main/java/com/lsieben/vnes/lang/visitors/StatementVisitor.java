package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.statements.Statement;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class StatementVisitor extends vNESBaseVisitor<Statement> {
    @Override
    public Statement visitStatement(vNESParser.StatementContext ctx) {
        Statement statement = null;

        if (ctx.functionCall() != null) {
            statement = ctx.functionCall().accept(new FunctionCallVisitor());
        } else if (ctx.returnStatement() != null) {
            statement = ctx.returnStatement().accept(new ReturnStatementVisitor());
        }
        return statement;
    }
}
