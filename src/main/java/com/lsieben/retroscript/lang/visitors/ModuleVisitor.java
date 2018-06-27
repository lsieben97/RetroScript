package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.Entity;
import com.lsieben.retroscript.lang.constructs.Function;
import com.lsieben.retroscript.lang.constructs.ModuleType;
import com.lsieben.retroscript.lang.constructs.RetroScriptModule;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

import java.util.List;
import java.util.stream.Collectors;

public class ModuleVisitor extends RetroScriptBaseVisitor<RetroScriptModule> {
    @Override
    public RetroScriptModule visitModule(RetroScriptParser.ModuleContext ctx) {
        RetroScriptModule module = new RetroScriptModule(ctx);
        if(ctx.moduleDefinition().NativeModifier() != null) {
            module.setType(ModuleType.Native);
        } else {
            module.setType(ModuleType.Normal);
        }
        module.setModuleName(ctx.moduleDefinition().ID().getSymbol().getText());

        List<Entity> entities = ctx.entity().stream().map(entity -> entity.accept(new EntityVisitor())).collect(Collectors.toList());

        for (Entity entity : entities) {
            entity.setModule(module);
        }

        module.setEntities(entities);

        List<Function> functions = ctx.function().stream().map(function -> function.accept(new FunctionVisitor())).collect(Collectors.toList());

        for (Function function : functions) {
            function.setModule(module);
        }

        module.setFunctions(functions);

        return module;
    }
}
