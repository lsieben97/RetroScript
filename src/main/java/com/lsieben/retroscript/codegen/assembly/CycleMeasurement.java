package com.lsieben.retroscript.codegen.assembly;

public class CycleMeasurement {
    private int value;
    private CycleMeasureMode mode;

    public CycleMeasurement(int value, CycleMeasureMode mode){
        this.value = value;
        this.mode = mode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public CycleMeasureMode getMode() {
        return mode;
    }

    public void setMode(CycleMeasureMode mode) {
        this.mode = mode;
    }
}
