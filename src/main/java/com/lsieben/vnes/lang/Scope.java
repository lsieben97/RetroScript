package com.lsieben.vnes.lang;

public class Scope {
    // variables
    private Scope parent;

    public Scope(Scope parent) {
        this.parent = parent;
    }
}
