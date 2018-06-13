package com.lsieben.vnes.lang.constructs;


import org.antlr.v4.runtime.ParserRuleContext;

public class FunctionDefinitionArgument extends LanguageConstruct implements Identifier {
    private String name;
    private DataType dataType;

    public FunctionDefinitionArgument(ParserRuleContext context) {
        super(context);
    }

    @Override
    public String getIdentifierName() {
        return this.name;
    }

    @Override
    public DataType getIdentifierType() {
        return this.dataType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDataType(DataType datatype) {
        this.dataType = datatype;
    }
}
