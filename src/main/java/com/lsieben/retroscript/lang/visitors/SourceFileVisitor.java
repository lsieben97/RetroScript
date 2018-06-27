package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.*;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

import java.util.List;
import java.util.stream.Collectors;

public class SourceFileVisitor extends RetroScriptBaseVisitor<SourceFile> {

    @Override
    public SourceFile visitSourceFile(RetroScriptParser.SourceFileContext ctx) {
        SourceFile sourceFile = new SourceFile(ctx);

        List<RetroScriptModule> modules = ctx.module().stream().map(module -> module.accept(new ModuleVisitor())).collect(Collectors.toList());
        for( RetroScriptModule module : modules) {
            module.setSourceFile(sourceFile);
        }
        sourceFile.setModules(modules);

        List<UsingStatement> usingStatements = ctx.useStatement().stream().map(useStatement -> useStatement.accept(new UsingStatementVisitor())).collect(Collectors.toList());
        for( UsingStatement usingStatement : usingStatements) {
            usingStatement.setSourceFile(sourceFile);
        }
        sourceFile.setUsingStatements(usingStatements);

        sourceFile.setCodeBase(CodeBase.getCurrent());

        return sourceFile;
    }


}
