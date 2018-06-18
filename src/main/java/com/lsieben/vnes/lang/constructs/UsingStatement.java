package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.validators.UsingStatementValidator;
import org.antlr.v4.runtime.ParserRuleContext;

public class UsingStatement extends LanguageConstruct {
    private String moduleName;
    private vNESModule module;
    private SourceFile sourceFile;

    public UsingStatement(ParserRuleContext context) {
        super(context);
        setValidator(new UsingStatementValidator(this));
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

    public SourceFile getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(SourceFile sourceFile) {
        this.sourceFile = sourceFile;
    }
}
