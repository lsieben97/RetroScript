package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.UsingStatement;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

public class UsingStatementVisitor extends RetroScriptBaseVisitor<UsingStatement> {
    @Override
    public UsingStatement visitUseStatement(RetroScriptParser.UseStatementContext ctx) {
        UsingStatement usingStatement = new UsingStatement(ctx);

        usingStatement.setModuleName(ctx.ID().getSymbol().getText());

        return usingStatement;
    }
}
