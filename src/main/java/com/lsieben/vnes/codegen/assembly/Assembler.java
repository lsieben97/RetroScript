package com.lsieben.vnes.codegen.assembly;

import com.lsieben.vnes.logger.Logger;

import java.util.ArrayList;
import java.util.List;

public class Assembler {
    private static List<AsmInstruction> instructions = new ArrayList<>();

    public static List<AsmInstruction> getInstructions() {
        return instructions;
    }

    /**
     * Add an instruction to the sourceFile memory.
     *
     * @param instruction The instruction to add.
     */
    public static byte[] add(AsmInstruction instruction) {
        if (instruction.getOpcode().instructionMap.containsKey(instruction.getAddressingMode())) {
            instructions.add(instruction);
            return MemoryManager.addInstruction(instruction);
        } else {
            Logger.writeError("Instruction '" +
                    instruction.getOpcode().description +
                    "' (" +
                    instruction.getOpcode().mnemonic +
                    ") doesn't has an instruction code for addressing mode '" +
                    instruction.getAddressingMode().name() +
                    "'.");
            // will never execute as logger terminates execution when an error is logged.
            return null;
        }
    }
}
