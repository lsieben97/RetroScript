package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class JMP extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Absolute, tb("4C"));
        this.instructionMap.put(AddressingMode.Indirect, tb("6C"));

        this.mnemonic = "JMP";
        this.description = "Jump to New Location";

        this.cycleMap.put(AddressingMode.Absolute, new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Indirect, new CycleMeasurement(5, CycleMeasureMode.Absolute));
    }
}
