package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.DataType;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class DataTypeVisitor extends vNESBaseVisitor<DataType> {
    @Override
    public DataType visitDataType(vNESParser.DataTypeContext ctx) {
        DataType dataType = new DataType(ctx);

        if (ctx.ID() != null) {
            dataType.setName(ctx.ID().getText());
        } else {
            dataType.setName(ctx.getText());
        }

        return dataType;
    }
}
