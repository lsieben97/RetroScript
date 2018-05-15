package com.lsieben.vnes.codegen.assembly;

import java.util.ArrayList;
import java.util.List;

public class Assembler {
    private static List<AsmInstruction> instructions = new ArrayList<>();

    public static List<AsmInstruction> getInstructions() {
        return instructions;
    }

    /**
     * Add an instruction to the program memory.
     * @param instruction The instruction to add.
     */
    public static byte[] add(AsmInstruction instruction) {
        instructions.add(instruction);
        return MemoryManager.addInstruction(instruction);
    }
}
