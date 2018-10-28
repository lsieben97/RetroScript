package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.constructs.statements.Statement;
import com.lsieben.retroscript.lang.validators.FunctionValidator;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class Function extends LanguageConstruct {
    private FunctionSignature signature;
    private Entity entity;
    private RetroScriptModule module;
    private List<Statement> statements;

    public Function(ParserRuleContext context) {
        super(context);
        setValidator(new FunctionValidator(this));
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public RetroScriptModule getModule() {
        return module;
    }

    public void setModule(RetroScriptModule module) {
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
