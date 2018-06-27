package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.FunctionDefinitionArgument;
import com.lsieben.retroscript.lang.constructs.FunctionSignature;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionSignatureVisitor extends RetroScriptBaseVisitor<FunctionSignature> {
    @Override
    public FunctionSignature visitFunctionDefinition(RetroScriptParser.FunctionDefinitionContext ctx) {
        FunctionSignature signature = new FunctionSignature(ctx);

        signature.setName(ctx.ID().getText());
        if (ctx.dataType() != null) {
            signature.setReturnType(ctx.dataType().accept(new DataTypeVisitor()));
            signature.setHasReturnType(true);
        } else {
            signature.setHasReturnType(false);
        }

        List<FunctionDefinitionArgument> arguments = ctx.definitionArgumentSpec().stream().map(argument -> argument.accept(new FunctionDefinitionArgumentVisitor())).collect(Collectors.toList());

        for (FunctionDefinitionArgument argument : arguments) {
            argument.setFunctionSignature(signature);
        }

        signature.setArguments(arguments);

        return signature;
    }
}
