package com.lsieben.retroscript.lang.implementors;

public abstract class Implementor<T> {
    private T construct;
    private boolean implemented;
    public Implementor(T construct) {
        this.construct = construct;
    }

    public abstract void implement();
    public abstract void implementChildren();

    public boolean isImplemented() {
        return implemented;
    }

    public void setImplemented(boolean implemented) {
        this.implemented = implemented;
    }
}
