package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

public class PropertyDefinition extends LanguageConstruct {

    private String name;
    private DataType type;
    private Expression value;
    private boolean mandatory = false;

    public PropertyDefinition(ParserRuleContext context) {
        super(context);
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

    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }
}
