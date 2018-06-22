package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.Function;
import com.lsieben.vnes.lang.constructs.FunctionSignature;
import com.lsieben.vnes.lang.constructs.statements.Statement;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionVisitor extends vNESBaseVisitor<Function> {
    @Override
    public Function visitFunction(vNESParser.FunctionContext ctx) {
        Function function = new Function(ctx);

        FunctionSignature signature = ctx.functionDefinition().accept(new FunctionSignatureVisitor());
        signature.setFunction(function);
        function.setSignature(signature);

        List<Statement> statements = ctx.functionBody().statement().stream().map(statement -> statement.accept(new StatementVisitor())).collect(Collectors.toList());

        for (Statement statement : statements) {
            statement.setFunction(function);
        }
        function.setStatements(statements);
        return function;
    }
}
