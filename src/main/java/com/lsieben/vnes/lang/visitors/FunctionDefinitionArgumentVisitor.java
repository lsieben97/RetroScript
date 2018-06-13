package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.FunctionDefinitionArgument;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;


public class FunctionDefinitionArgumentVisitor extends vNESBaseVisitor<FunctionDefinitionArgument> {
    @Override
    public FunctionDefinitionArgument visitDefinitionArgumentSpec(vNESParser.DefinitionArgumentSpecContext ctx) {
        FunctionDefinitionArgument argument = new FunctionDefinitionArgument(ctx);
        argument.setName(ctx.ID().getText());
        argument.setDataType(ctx.dataType().accept(new DataTypeVisitor()));
        return argument;
    }
}
