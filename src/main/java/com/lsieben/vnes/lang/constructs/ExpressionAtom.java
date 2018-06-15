package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

public class ExpressionAtom extends LanguageConstruct {
    private DataType type;
    private int integer;
    private String string;
    private FunctionCall functionCall;
    private String id;
    private boolean booleanValue;

    public ExpressionAtom(ParserRuleContext context) {
        super(context);
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }
}
