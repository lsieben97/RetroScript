package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class PHA extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Implied, tb("48"));

        this.mnemonic = "PHA";
        this.description = "Push Accumulator on Stack";

        this.cycleMap.put(AddressingMode.Implied, new CycleMeasurement(3, CycleMeasureMode.Absolute));
    }
}
