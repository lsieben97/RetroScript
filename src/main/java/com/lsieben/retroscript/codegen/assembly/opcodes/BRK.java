package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.Opcode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class BRK extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Implied, tb("00"));

        this.mnemonic = "BRK";
        this.description = "Force Break";

        this.cycleMap.put(AddressingMode.Implied, new CycleMeasurement(7, CycleMeasureMode.AddOneOnSamePageTwoOverPageBoundry));
    }
}
