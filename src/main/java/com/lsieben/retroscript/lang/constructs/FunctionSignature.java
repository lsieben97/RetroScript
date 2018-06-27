package com.lsieben.retroscript.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class FunctionSignature extends LanguageConstruct {
    private String name;
    private DataType returnType;
    private boolean hasReturnType;
    private List<FunctionDefinitionArgument> arguments;
    private Function function;

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

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }
}
