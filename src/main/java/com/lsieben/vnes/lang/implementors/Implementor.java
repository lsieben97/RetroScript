package com.lsieben.vnes.lang.implementors;

import com.lsieben.vnes.lang.constructs.LanguageConstruct;

public abstract class Implementor<T> {
    private T construct;
    public Implementor(T construct) {
        this.construct = construct;
    }

    public abstract void implement();
    public abstract void implementChildren();
}
