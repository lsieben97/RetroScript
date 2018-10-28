package com.lsieben.retroscript.codegen.assembly;

import java.util.HashMap;
import java.util.Map;

public abstract class OpCode {
    public Map<AddressingMode, Byte> instructionMap = new HashMap<>();
    public Map<AddressingMode, CycleMeasurement> cycleMap = new HashMap<>();
    public String mnemonic;
    public String description;


    protected abstract void initialize();

    public OpCode() {
        initialize();
    }
}
