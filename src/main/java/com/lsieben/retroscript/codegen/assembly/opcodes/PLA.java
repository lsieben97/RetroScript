package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class PLA extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Implied, tb("68"));

        this.mnemonic = "PLA";
        this.description = "Pull Accumulator From Stack";
        this.cycleMap.put(AddressingMode.Implied, new CycleMeasurement(4, CycleMeasureMode.Absolute));
    }
}
