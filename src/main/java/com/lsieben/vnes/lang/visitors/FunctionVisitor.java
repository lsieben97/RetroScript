package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.Function;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class FunctionVisitor extends vNESBaseVisitor<Function> {
    @Override
    public Function visitFunction(vNESParser.FunctionContext ctx) {
        Function function = new Function(ctx);

        return function;
    }
}
