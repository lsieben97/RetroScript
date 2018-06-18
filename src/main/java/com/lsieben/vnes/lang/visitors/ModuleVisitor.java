package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.Entity;
import com.lsieben.vnes.lang.constructs.Function;
import com.lsieben.vnes.lang.constructs.ModuleType;
import com.lsieben.vnes.lang.constructs.vNESModule;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

import java.util.List;
import java.util.stream.Collectors;

public class ModuleVisitor extends vNESBaseVisitor<vNESModule> {
    @Override
    public vNESModule visitModule(vNESParser.ModuleContext ctx) {
        vNESModule module = new vNESModule(ctx);
        if(ctx.moduleDefinition().NativeModifier() != null) {
            module.setType(ModuleType.Native);
        } else {
            module.setType(ModuleType.Normal);
        }
        module.setModuleName(ctx.moduleDefinition().ID().getSymbol().getText());

        List<Entity> entities = ctx.entity().stream().map(entity -> entity.accept(new EntityVisitor())).collect(Collectors.toList());
        module.setEntities(entities);

        List<Function> functions = ctx.function().stream().map(function -> function.accept(new FunctionVisitor())).collect(Collectors.toList());
        module.setFunctions(functions);
        return module;
    }
}
