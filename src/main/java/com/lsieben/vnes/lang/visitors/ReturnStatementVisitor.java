package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.statements.ReturnStatement;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class ReturnStatementVisitor extends vNESBaseVisitor<ReturnStatement> {
    @Override
    public ReturnStatement visitReturnStatement(vNESParser.ReturnStatementContext ctx) {
        ReturnStatement returnStatement = new ReturnStatement(ctx);
        returnStatement.setExpression(ctx.expression().accept(new ExpressionVisitor()));
        return returnStatement;
    }
}
