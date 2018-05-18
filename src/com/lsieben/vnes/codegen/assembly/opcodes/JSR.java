package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class JSR extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Absolute, tb("20"));

        this.mnemonic = "JSR";
        this.description = "Jump to New Location Saving Return Address";

        this.cycleMap.put(AddressingMode.Absolute, new CycleMeasurement(6, CycleMeasureMode.Absolute));
    }
}
