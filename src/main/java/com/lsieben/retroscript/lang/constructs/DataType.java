package com.lsieben.retroscript.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

public class DataType extends LanguageConstruct {
    private String name;
    public DataType(ParserRuleContext context) {
        super(context);
    }

    public DataType(String name) {
        super(null);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DataType) {
            DataType other = (DataType) obj;
            return other.getName().equals(this.name);
        }
        return false;
    }
}
