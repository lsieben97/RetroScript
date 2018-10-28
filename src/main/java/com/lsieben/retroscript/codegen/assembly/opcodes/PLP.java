package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class PLP extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Implied, tb("28"));

        this.mnemonic = "PLP";
        this.description = "Pull Processor Status From Stack";

        this.cycleMap.put(AddressingMode.Implied, new CycleMeasurement(4, CycleMeasureMode.Absolute));
    }
}
