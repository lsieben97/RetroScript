package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

public class UsingStatement extends LanguageConstruct {
    private String moduleName;
    private vNESModule module;

    public UsingStatement(ParserRuleContext context) {
        super(context);
    }

    public String getModuleName() {
        return moduleName;
    }

    public vNESModule getModule() {
        return module;
    }

    public void setModule(vNESModule module) {
        this.module = module;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
