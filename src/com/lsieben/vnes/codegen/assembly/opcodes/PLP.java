package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class PLP extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Implied, tb("28"));

        this.mnemonic = "PLP";
        this.description = "Pull Processor Status From Stack";

        this.cycleMap.put(AddressingMode.Implied, new CycleMeasurement(4, CycleMeasureMode.Absolute));
    }
}
