package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.ModuleType;
import com.lsieben.vnes.lang.constructs.vNESModule;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

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
        return module;
    }
}
