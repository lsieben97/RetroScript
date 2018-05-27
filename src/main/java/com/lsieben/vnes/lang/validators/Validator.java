package com.lsieben.vnes.lang.validators;

import com.lsieben.vnes.lang.constructs.LanguageConstruct;
import com.lsieben.vnes.lang.exceptions.vNESCompilerException;

public abstract class Validator<T extends LanguageConstruct> {
    private T construct;
    public Validator(T construct) {
        this.construct = construct;
    }

    public abstract void implement() throws vNESCompilerException;
    public abstract void implementChildren();

    public String getSourcePosition() {
        return construct.getContext().getStart().getInputStream().getSourceName() +
                " at " + String.valueOf(construct.getContext().getStart().getLine()) +
                " : " + String.valueOf(construct.getContext().getStart().getCharPositionInLine());
    }
}
