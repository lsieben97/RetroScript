package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.FunctionDefinitionArgument;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;


public class FunctionDefinitionArgumentVisitor extends RetroScriptBaseVisitor<FunctionDefinitionArgument> {
    @Override
    public FunctionDefinitionArgument visitDefinitionArgumentSpec(RetroScriptParser.DefinitionArgumentSpecContext ctx) {
        FunctionDefinitionArgument argument = new FunctionDefinitionArgument(ctx);
        argument.setName(ctx.ID().getText());
        argument.setDataType(ctx.dataType().accept(new DataTypeVisitor()));
        return argument;
    }
}
