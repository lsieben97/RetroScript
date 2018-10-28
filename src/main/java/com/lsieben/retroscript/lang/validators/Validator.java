package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.*;
import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;
import com.lsieben.retroscript.lang.exceptions.vNESWarning;
import com.lsieben.retroscript.logger.Logger;

public abstract class Validator<T extends LanguageConstruct> {
    private T construct;
    public Validator(T construct) {
        this.construct = construct;
    }

    public abstract void validate() throws vNESCompilerException;

    public String getSourcePositionOfConstruct(LanguageConstruct construct) {
        return construct.getContext().getStart().getInputStream().getSourceName() +
                " at line " + String.valueOf(construct.getContext().getStart().getLine()) +
                " | column " + String.valueOf(construct.getContext().getStart().getCharPositionInLine());
    }

    public void makeWarning(vNESWarning warning) {
        warning.setLocation(getSourcePositionOfConstruct(getConstruct()));
        Logger.writeWarning(warning.getMessage());
    }

    public void makeError(vNESCompilerException error) throws vNESCompilerException {
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
}
