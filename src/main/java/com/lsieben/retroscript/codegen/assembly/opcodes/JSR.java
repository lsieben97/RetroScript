package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class JSR extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Absolute, tb("20"));

        this.mnemonic = "JSR";
        this.description = "Jump to New Location Saving Return Address";

        this.cycleMap.put(AddressingMode.Absolute, new CycleMeasurement(6, CycleMeasureMode.Absolute));
    }
}
