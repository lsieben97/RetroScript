package com.lsieben.retroscript.codegen.assembly;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import static com.lsieben.retroscript.codegen.assembly.Util.getSizeForAddressingMode;

public class MemoryManager {
    // todo define memory sections eg. sourceFile, ppu etc...
    private static List<Byte> programMemory = new ArrayList<>();
    private static int programPointer = 0;

    private static List<Byte> internalRAM = new ArrayList<>(2048);

    static byte[] addInstruction(AsmInstruction instruction) {
        programMemory.add(instruction.getOpcode().instructionMap.get(instruction.getAddressingMode()));
        byte[] address = ByteBuffer.allocate(2).putInt(programMemory.size()).array();
        if(getSizeForAddressingMode(instruction.getAddressingMode()) > 1) {
            for(byte b : instruction.getArgument()) {
                programMemory.add(b);
            }
        } else if (instruction.getArgument().length == 1) {
            programMemory.add(instruction.getArgument()[0]);
        }
        return address;
    }
}
