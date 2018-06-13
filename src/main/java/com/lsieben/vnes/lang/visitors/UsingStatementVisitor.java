package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.UsingStatement;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class UsingStatementVisitor extends vNESBaseVisitor<UsingStatement> {
    @Override
    public UsingStatement visitUseStatement(vNESParser.UseStatementContext ctx) {
        UsingStatement usingStatement = new UsingStatement(ctx);

        usingStatement.setModuleName(ctx.ID().getSymbol().getText());

        return usingStatement;
    }
}
