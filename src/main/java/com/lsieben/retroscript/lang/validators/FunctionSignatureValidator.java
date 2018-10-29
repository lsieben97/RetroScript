package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.Function;
import com.lsieben.retroscript.lang.constructs.FunctionDefinitionArgument;
import com.lsieben.retroscript.lang.constructs.FunctionSignature;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidNameException;
import com.lsieben.retroscript.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

import java.util.List;

public class FunctionSignatureValidator extends Validator<FunctionSignature> {
    public FunctionSignatureValidator(FunctionSignature functionSignature) {
        super(functionSignature);
    }

    @Override
    public void validate() throws RetroScriptCompilerException {
        validateName();
        validateReturnType();
        validateArguments();
    }

    private void validateArguments() throws InvalidNameException, ReferenceNotFoundException {
        if (getConstruct().hasArguments()) {
            for (FunctionDefinitionArgument argument : getConstruct().getArguments()) {
                int count = 0;
                for (FunctionDefinitionArgument arg : getConstruct().getArguments()) {
                    if (argument.getName().equals(arg.getName())) {
                        count++;
                    }
                }
                if (count > 1) {
                    throw new InvalidNameException(getSourcePositionOfConstruct(argument), argument.getName(), "multiple arguments with the same name.");
                }
            if (argument.getDataType().isId()) {
                    if (!checkType(argument.getDataType(), getConstruct().getFunction().getModule().getSourceFile())) {
                        throw new ReferenceNotFoundException(getSourcePositionOfConstruct(getConstruct()), "Datatype", argument.getName());
                    }
                }
            }
        }
    }


    private void validateReturnType() throws ReferenceNotFoundException {
        if (getConstruct().hasReturnType()) {
            if (getConstruct().getReturnType().isId()) {
                if (!checkType(getConstruct().getReturnType(), getConstruct().getFunction().getModule().getSourceFile())) {
                    throw new ReferenceNotFoundException(getSourcePositionOfConstruct(getConstruct()), "Datatype", getConstruct().getReturnType().getName());
                }
            }
        }
    }

    private void validateName() throws InvalidNameException {
        List<Function> functionsInCurrentModule = getConstruct().getFunction().getModule().getFunctions();
        int count = 0;
        for (Function function : functionsInCurrentModule) {
            if (function.getSignature().getName().equals(getConstruct().getName())) {
                count++;
            }
        }

        if (count > 1) {
            throw new InvalidNameException(getSourcePositionOfConstruct(getConstruct()), getConstruct().getName(), "Function already exists in the current module.");
        }
    }
}
