package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class BCS extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Relative, tb("B0"));

        this.mnemonic = "BCS";
        this.description = "Branch on Carry Set";

        this.cycleMap.put(AddressingMode.Relative, new CycleMeasurement(2, CycleMeasureMode.AddOneOnSamePageTwoOverPageBoundry));
    }
}
