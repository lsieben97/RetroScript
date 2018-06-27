package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.validators.SourceFileValidator;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class SourceFile extends LanguageConstruct {
    public SourceFile(ParserRuleContext context) {
        super(context);
        setValidator(new SourceFileValidator(this));
    }

    private List<RetroScriptModule> modules;
    private List<UsingStatement> usingStatements;
    private CodeBase codeBase;

    public List<RetroScriptModule> getModules() {
        return modules;
    }

    public void setModules(List<RetroScriptModule> modules) {
        this.modules = modules;
    }

    public boolean hasModules() {
        return this.modules != null;
    }

    public List<UsingStatement> getUsingStatements() {
        return usingStatements;
    }

    public void setUsingStatements(List<UsingStatement> usingStatements) {
        this.usingStatements = usingStatements;
    }

    public CodeBase getCodeBase() {
        return codeBase;
    }

    public void setCodeBase(CodeBase codeBase) {
        this.codeBase = codeBase;
    }
}
