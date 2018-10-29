package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.Entity;
import com.lsieben.retroscript.lang.constructs.Function;
import com.lsieben.retroscript.lang.constructs.RetroScriptModule;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidModuleTypeException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

import java.util.List;

public class ModuleValidator extends Validator<RetroScriptModule> {
    public ModuleValidator(RetroScriptModule construct) {
        super(construct);
    }

    @Override
    public void validate() throws RetroScriptCompilerException {
        validateModuleType();

        validateFunctions();

        validateEntities();
    }

    private void validateEntities() throws RetroScriptCompilerException {
        for (Entity entity : getConstruct().getEntities()) {
            entity.getValidator().validate();
        }
    }

    private void validateFunctions() throws RetroScriptCompilerException {
        for (Function function : getConstruct().getFunctions()) {
            function.getValidator().validate();
        }
    }

    private void validateModuleType() throws InvalidModuleTypeException {
        List<RetroScriptModule> modules = getConstruct().getSourceFile().getCodeBase().getModules(getConstruct().getModuleName());
        for (RetroScriptModule module : modules) {
            if (module.getType() != getConstruct().getType()) {
                throw new InvalidModuleTypeException(getSourcePositionOfConstruct(getConstruct()), getConstruct().getModuleName(), getSourcePositionOfConstruct(module));
            }
        }
    }
}
