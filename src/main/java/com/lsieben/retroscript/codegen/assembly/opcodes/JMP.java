package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class JMP extends OpCode {
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
