package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tba;

public class LDA extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate, tba("A9"));
        this.instructionMap.put(AddressingMode.ZeroPage, tba("A5"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tba("B5"));
        this.instructionMap.put(AddressingMode.Absolute, tba("AD"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tba("BD"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedY, tba("B9"));
        this.instructionMap.put(AddressingMode.IndirectX, tba("A1"));
        this.instructionMap.put(AddressingMode.IndirectY, tba("B1"));

        this.mnemonic = "LDA";
        this.description = "Load Accumulator";

    }
}
