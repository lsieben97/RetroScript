package com.lsieben.vnes.lang.validators;

import com.lsieben.vnes.lang.constructs.LanguageConstruct;
import com.lsieben.vnes.lang.exceptions.vNESCompilerException;

public abstract class Validator<T extends LanguageConstruct> {
    protected T construct;
    public Validator(T construct) {
        this.construct = construct;
    }

    public abstract void validate() throws vNESCompilerException;
    public abstract void validateChildren() throws vNESCompilerException;

    public String getSourcePositionOfConstruct(LanguageConstruct construct) {
        return construct.getContext().getStart().getInputStream().getSourceName() +
                " at line " + String.valueOf(construct.getContext().getStart().getLine()) +
                " | column " + String.valueOf(construct.getContext().getStart().getCharPositionInLine());
    }
}
