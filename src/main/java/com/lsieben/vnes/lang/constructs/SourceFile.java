package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class SourceFile extends LanguageConstruct {
    public SourceFile(ParserRuleContext context) {
        super(context);
    }

    private List<vNESModule> modules;
    private List<Entity> entities;
    private List<UsingStatement> usingStatements;


    public List<vNESModule> getModules() {
        return modules;
    }

    public void setModules(List<vNESModule> modules) {
        this.modules = modules;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public boolean hasModules() {
        return this.modules != null;
    }

    public boolean hasEntities() {
        return this.entities != null;
    }

    public List<UsingStatement> getUsingStatements() {
        return usingStatements;
    }

    public void setUsingStatements(List<UsingStatement> usingStatements) {
        this.usingStatements = usingStatements;
    }
}
