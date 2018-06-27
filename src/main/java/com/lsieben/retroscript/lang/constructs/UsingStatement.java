package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.validators.UsingStatementValidator;
import org.antlr.v4.runtime.ParserRuleContext;

public class UsingStatement extends LanguageConstruct {
    private String moduleName;
    private RetroScriptModule module;
    private SourceFile sourceFile;

    public UsingStatement(ParserRuleContext context) {
        super(context);
        setValidator(new UsingStatementValidator(this));
    }

    public String getModuleName() {
        return moduleName;
    }

    public RetroScriptModule getModule() {
        return module;
    }

    public void setModule(RetroScriptModule module) {
        this.module = module;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public SourceFile getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(SourceFile sourceFile) {
        this.sourceFile = sourceFile;
    }
}
