package com.lsieben.retroscript.codegen.assembly;

public class AsmInstruction {
    private OpCode opcode;
    private AddressingMode addressingMode;
    private byte[] argument;

    public AsmInstruction(OpCode opcode, AddressingMode addressingMode, byte[] argument) {
        this.opcode = opcode;
        this.addressingMode = addressingMode;
        this.argument = argument;
    }

    public AsmInstruction(OpCode opcode, AddressingMode addressingMode) {
        this.opcode = opcode;
        this.addressingMode = addressingMode;
        this.argument = new byte[] {};
    }

    public OpCode getOpcode() {
        return opcode;
    }

    public AddressingMode getAddressingMode() {
        return addressingMode;
    }

    public byte[] getArgument() {
        return argument;
    }
}
