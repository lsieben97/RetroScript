package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.*;
import com.lsieben.retroscript.lang.exceptions.errors.InternalCompilerException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptWarning;
import com.lsieben.retroscript.logger.Logger;

import java.util.List;

public abstract class Validator<T extends LanguageConstruct> {
    private T construct;
    public Validator(T construct) {
        this.construct = construct;
    }

    public abstract void validate() throws RetroScriptCompilerException;

    public String getSourcePositionOfConstruct(LanguageConstruct construct) {
        return construct.getContext().getStart().getInputStream().getSourceName() +
                " at line " + String.valueOf(construct.getContext().getStart().getLine()) +
                " | column " + String.valueOf(construct.getContext().getStart().getCharPositionInLine());
    }

    public void makeWarning(RetroScriptWarning warning) {
        warning.setLocation(getSourcePositionOfConstruct(getConstruct()));
        Logger.writeWarning(warning.getMessage());
    }

    public void makeError(RetroScriptCompilerException error) throws RetroScriptCompilerException {
        error.setLocation(getSourcePositionOfConstruct(getConstruct()));
        throw error;
    }

    public void setContruct(LanguageConstruct contruct) {
        this.construct = getConstruct();
    }


    public T getConstruct() {
        return construct;
    }

    /**
     * Checks if the given datatype is present in any of the modules in this source file, or in any of the modules referenced by the source file.
     * @param type The datatype to check
     * @param sourceFile The source file to check.
     * @return true if the type has been found, false otherwise.
     */
    protected boolean checkType(DataType type, SourceFile sourceFile) {
        for (RetroScriptModule module : sourceFile.getModules()) {
            if (module.hasDataType(type)) {
                return true;
            }
        }

        for (UsingStatement usingStatement : sourceFile.getUsingStatements()) {
            for (RetroScriptModule module : CodeBase.getCurrent().getModules(usingStatement.getModuleName())) {
                if (module.hasDataType(type)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Check if the entity name exists more then 1 time within it's declaring module.
     * @param entity The entity to check.
     * @return true if it's found multiple times, false otherwise.
     */
    public boolean checkEntityName(Entity entity) {
        List<RetroScriptModule> modules = CodeBase.getCurrent().getModules(entity.getModule().getModuleName());
        int count = 0;
        for (RetroScriptModule module : modules) {
            for (Entity moduleEntity : module.getEntities()) {
                if (moduleEntity.getName().equals(entity.getName())) {
                    count++;
                }
            }
        }
        return count > 1;
    }

    public Entity getEntity(String name, SourceFile sourceFile) throws RetroScriptCompilerException {
        for (RetroScriptModule module : sourceFile.getModules()) {
            for (Entity entity : module.getEntities()) {
                if (entity.getName().equals(name)) {
                    return entity;
                }
            }
        }

        for (UsingStatement usingStatement : sourceFile.getUsingStatements()) {
            for (RetroScriptModule module : CodeBase.getCurrent().getModules(usingStatement.getModuleName())) {
                for (Entity entity : module.getEntities()) {
                    if (entity.getName().equals(name)) {
                        return entity;
                    }
                }
            }
        }
        throw new InternalCompilerException("Validator.getEntity", "Could not find entity instance for name '" + name + "'.");
    }
}
