package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.vNESModule;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class ModuleVisitor extends vNESBaseVisitor<vNESModule> {
    @Override
    public vNESModule visitModule(vNESParser.ModuleContext ctx) {
        return new vNESModule(ctx);
    }
}
