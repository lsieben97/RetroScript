package com.lsieben.vnes.lang.exceptions;

public class vNESCompilerException extends Exception {
    public vNESCompilerException(String sourcePosition) {
        this.sourcePosition = sourcePosition;
    }
    private String sourcePosition;
}
