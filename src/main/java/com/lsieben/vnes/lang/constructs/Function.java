package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

public class Function extends LanguageConstruct {
    private FunctionSignature signature;

    public Function(ParserRuleContext context) {
        super(context);
    }
}
