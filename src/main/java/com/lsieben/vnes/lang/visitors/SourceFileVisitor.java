package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.*;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

import java.util.List;
import java.util.stream.Collectors;

public class SourceFileVisitor extends vNESBaseVisitor<SourceFile> {

    @Override
    public SourceFile visitSourceFile(vNESParser.SourceFileContext ctx) {
        SourceFile sourceFile = new SourceFile(ctx);

        List<vNESModule> modules = ctx.module().stream().map(module -> module.accept(new ModuleVisitor())).collect(Collectors.toList());
        for( vNESModule module : modules) {
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
