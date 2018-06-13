package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

public class Function extends LanguageConstruct implements Identifier {
    private FunctionSignature signature;

    public Function(ParserRuleContext context) {
        super(context);
    }

    @Override
    public String getIdentifierName() {
        return this.signature.getName();
    }

    @Override
    public DataType getIdentifierType() {
        return this.signature.getReturnType();
    }
}
