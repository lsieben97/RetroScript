package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class CPY extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate, tb("C0"));
        this.instructionMap.put(AddressingMode.ZeroPage,  tb("C4"));
        this.instructionMap.put(AddressingMode.Absolute,  tb("CC"));

        this.mnemonic = "CPY";
        this.description = "Compare Memory and Index Y";

        this.cycleMap.put(AddressingMode.Immediate, new CycleMeasurement(2, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPage,  new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,  new CycleMeasurement(4, CycleMeasureMode.Absolute));
    }
}
