package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class FunctionSignature extends LanguageConstruct {
    private String name;
    private DataType returnType;
    private boolean hasReturnType;
    private List<FunctionDefinitionArgument> arguments;

    public FunctionSignature(ParserRuleContext context) {
        super(context);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }

    public List<FunctionDefinitionArgument> getArguments() {
        return arguments;
    }

    public void setArguments(List<FunctionDefinitionArgument> arguments) {
        this.arguments = arguments;
    }

    public boolean hasReturnType() {
        return hasReturnType;
    }

    public void setHasReturnType(boolean hasReturnType) {
        this.hasReturnType = hasReturnType;
    }
}
