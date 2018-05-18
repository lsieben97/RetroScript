package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class BCC extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Relative, tb("90"));

        this.mnemonic = "BCC";
        this.description = "Branch on Carry Clear";

        this.cycleMap.put(AddressingMode.Relative, new CycleMeasurement(2, CycleMeasureMode.AddOneOnSamePageTwoOverPageBoundry));
    }
}
