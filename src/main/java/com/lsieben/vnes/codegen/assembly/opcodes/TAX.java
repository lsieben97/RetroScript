package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class TAX extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Implied, tb("AA"));

        this.mnemonic = "TAX";
        this.description = "Transfer Accumulator to index X";

        this.cycleMap.put(AddressingMode.Implied, new CycleMeasurement(2, CycleMeasureMode.Absolute));
    }
}
