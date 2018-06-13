package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

public class Property extends LanguageConstruct implements Identifier {

    private String name;
    private DataType type;
    private Expression value;
    private boolean mandatory = false;

    public Property(ParserRuleContext context) {
        super(context);
    }

    @Override
    public String getIdentifierName() {
        return name;
    }

    @Override
    public DataType getIdentifierType() {
        return type;
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }
}
