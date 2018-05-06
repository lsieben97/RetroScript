package com.lsieben.vnes.codegen.assembly;

import java.util.ArrayList;
import java.util.List;

public class Assembler {
    private static List<AsmInstruction> instructions = new ArrayList<>();

    public static List<AsmInstruction> getInstructions() {
        return instructions;
    }

    public static void add(AsmInstruction instruction) {
        instructions.add(instruction);
    }
}
