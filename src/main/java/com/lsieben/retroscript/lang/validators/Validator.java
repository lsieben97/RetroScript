package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.LanguageConstruct;
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
}
