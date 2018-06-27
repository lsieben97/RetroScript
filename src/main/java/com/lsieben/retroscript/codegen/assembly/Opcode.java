package com.lsieben.retroscript.codegen.assembly;

import java.util.HashMap;
import java.util.Map;

public abstract class Opcode {
    public Map<AddressingMode, Byte> instructionMap = new HashMap<>();
    public Map<AddressingMode, CycleMeasurement> cycleMap = new HashMap<>();
    public String mnemonic;
    public String description;


    protected abstract void initialize();

    public Opcode() {
        initialize();
    }
}
