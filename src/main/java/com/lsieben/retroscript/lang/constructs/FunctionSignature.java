package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.validators.FunctionSignatureValidator;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class FunctionSignature extends LanguageConstruct {
    private String name;
    private DataType returnType;
    private boolean hasReturnType;
    private boolean hasArguments;
    private List<FunctionDefinitionArgument> arguments;
    private Function function;

    public FunctionSignature(ParserRuleContext context) {
        super(context);
        setValidator(new FunctionSignatureValidator(this));
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

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof FunctionSignature)) {
            return false;
        }
        FunctionSignature other = (FunctionSignature) obj;

        if (!other.getName().equals(getName())) {
            return false;
        }

        if (other.hasReturnType() != hasReturnType()) {
            return false;
        }

        if (other.getArguments().size() != getArguments().size()) {
            return false;
        }

        for (FunctionDefinitionArgument argument : other.getArguments()) {
            if (! hasArgument(argument)) {
                return false;
            }
        }

        return true;
    }

    private boolean hasArgument(FunctionDefinitionArgument otherArgument) {
        for (FunctionDefinitionArgument argument : getArguments()) {
            if (!argument.getDataType().equals(otherArgument.getDataType())) {
                continue;
            }

            if (!argument.getName().equals(getName())) {
                continue;
            }
            return true;
        }
        return false;
    }

    public boolean hasArguments() {
        return hasArguments;
    }

    public void setHasArguments(boolean hasArguments) {
        this.hasArguments = hasArguments;
    }
}
