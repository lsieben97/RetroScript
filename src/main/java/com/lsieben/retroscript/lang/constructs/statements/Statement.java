package com.lsieben.retroscript.lang.constructs.statements;

import com.lsieben.retroscript.lang.constructs.Function;
import com.lsieben.retroscript.lang.constructs.LanguageConstruct;
import org.antlr.v4.runtime.ParserRuleContext;

public class Statement extends LanguageConstruct {
    private Function function;

    public Statement(ParserRuleContext context) {
        super(context);
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }
}
