package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class BCC extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Relative, tb("90"));

        this.mnemonic = "BCC";
        this.description = "Branch on Carry Clear";

        this.cycleMap.put(AddressingMode.Relative, new CycleMeasurement(2, CycleMeasureMode.AddOneOnSamePageTwoOverPageBoundry));
    }
}
