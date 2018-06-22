package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.constructs.statements.Statement;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class Function extends LanguageConstruct {
    private FunctionSignature signature;
    private Entity entity;
    private vNESModule module;
    private List<Statement> statements;

    public Function(ParserRuleContext context) {
        super(context);
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public vNESModule getModule() {
        return module;
    }

    public void setModule(vNESModule module) {
        this.module = module;
    }

    public FunctionSignature getSignature() {
        return signature;
    }

    public void setSignature(FunctionSignature signature) {
        this.signature = signature;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }
}
