package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.Function;
import com.lsieben.retroscript.lang.constructs.FunctionSignature;
import com.lsieben.retroscript.lang.constructs.statements.Statement;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionVisitor extends RetroScriptBaseVisitor<Function> {
    @Override
    public Function visitFunction(RetroScriptParser.FunctionContext ctx) {
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
