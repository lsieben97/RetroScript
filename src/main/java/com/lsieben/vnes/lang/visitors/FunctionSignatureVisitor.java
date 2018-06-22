package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.FunctionDefinitionArgument;
import com.lsieben.vnes.lang.constructs.FunctionSignature;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionSignatureVisitor extends vNESBaseVisitor<FunctionSignature> {
    @Override
    public FunctionSignature visitFunctionDefinition(vNESParser.FunctionDefinitionContext ctx) {
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
