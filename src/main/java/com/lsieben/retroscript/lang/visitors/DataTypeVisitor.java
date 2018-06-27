package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.DataType;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

public class DataTypeVisitor extends RetroScriptBaseVisitor<DataType> {
    @Override
    public DataType visitDataType(RetroScriptParser.DataTypeContext ctx) {
        DataType dataType = new DataType(ctx);

        if (ctx.ID() != null) {
            dataType.setName(ctx.ID().getText());
        } else {
            dataType.setName(ctx.getText());
        }

        return dataType;
    }
}
