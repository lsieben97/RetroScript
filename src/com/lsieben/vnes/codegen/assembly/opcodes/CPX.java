package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class CPX extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate, tb("E0"));
        this.instructionMap.put(AddressingMode.ZeroPage,  tb("E4"));
        this.instructionMap.put(AddressingMode.Absolute,  tb("EC"));

        this.mnemonic = "CPX";
        this.description = "Compare Memory and Index X";

        this.cycleMap.put(AddressingMode.Immediate, new CycleMeasurement(2, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPage,  new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,  new CycleMeasurement(4, CycleMeasureMode.Absolute));
    }
}
