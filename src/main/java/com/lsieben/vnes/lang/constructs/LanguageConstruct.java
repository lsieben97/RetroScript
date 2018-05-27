package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.Scope;
import com.lsieben.vnes.lang.implementors.Implementor;
import com.lsieben.vnes.lang.validators.Validator;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class LanguageConstruct {
    private ParserRuleContext context;
    private Validator validator;
    private Implementor implementor;
    private Scope scope;

    public LanguageConstruct(ParserRuleContext context) {
        this.context = context;
    }

    public ParserRuleContext getContext() {
        return context;
    }

    public void setContext(ParserRuleContext context) {
        this.context = context;
    }

    public Validator getValidator() {
        return validator;
    }

    public void setValidator(Validator validator) {
        this.validator = validator;
    }

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }
}
