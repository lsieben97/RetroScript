package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.Entity;
import com.lsieben.vnes.lang.constructs.SourceFile;
import com.lsieben.vnes.lang.constructs.UsingStatement;
import com.lsieben.vnes.lang.constructs.vNESModule;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

import java.util.List;
import java.util.stream.Collectors;

public class SourceFileVisitor extends vNESBaseVisitor<SourceFile> {

    @Override
    public SourceFile visitSourceFile(vNESParser.SourceFileContext ctx) {
        SourceFile sourceFile = new SourceFile(ctx);

        List<vNESModule> modules = ctx.module().stream().map(module -> module.accept(new ModuleVisitor())).collect(Collectors.toList());
        sourceFile.setModules(modules);

        List<UsingStatement> usingStatements = ctx.useStatement().stream().map(useStatement -> useStatement.accept(new UsingStatementVisitor())).collect(Collectors.toList());
        sourceFile.setUsingStatements(usingStatements);

        return sourceFile;
    }


}
