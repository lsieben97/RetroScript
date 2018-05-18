package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class STY extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("84"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("94"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("8C"));

        this.mnemonic = "STY";
        this.description = "Store Index Y in Memory";

        this.cycleMap.put(AddressingMode.ZeroPage,         new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedX, new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,         new CycleMeasurement(4, CycleMeasureMode.Absolute));
    }
}
