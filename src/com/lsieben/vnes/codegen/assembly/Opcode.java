package com.lsieben.vnes.codegen.assembly;

import java.util.HashMap;
import java.util.Map;

public abstract class Opcode {
    public Map<AddressingMode, byte[]> instructionMap = new HashMap<>();
    public String mnemonic;
    public String description;


    protected abstract void initialize();

    public Opcode() {
        initialize();
    }
}
