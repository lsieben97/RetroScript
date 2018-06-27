package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.Opcode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class BPL extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Relative, tb("10"));

        this.mnemonic = "BPL";
        this.description = "Branch on Result Plus";

        this.cycleMap.put(AddressingMode.Relative, new CycleMeasurement(2, CycleMeasureMode.AddOneOnSamePageTwoOverPageBoundry));
    }
}
