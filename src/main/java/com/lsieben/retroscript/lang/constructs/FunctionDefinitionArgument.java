package com.lsieben.retroscript.lang.constructs;


import org.antlr.v4.runtime.ParserRuleContext;

public class FunctionDefinitionArgument extends LanguageConstruct {
    private String name;
    private DataType dataType;
    private FunctionSignature functionSignature;

    public FunctionDefinitionArgument(ParserRuleContext context) {
        super(context);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDataType(DataType datatype) {
        this.dataType = datatype;
    }

    public String getName() {
        return name;
    }

    public DataType getDataType() {
        return dataType;
    }

    public FunctionSignature getFunctionSignature() {
        return functionSignature;
    }

    public void setFunctionSignature(FunctionSignature functionSignature) {
        this.functionSignature = functionSignature;
    }
}
