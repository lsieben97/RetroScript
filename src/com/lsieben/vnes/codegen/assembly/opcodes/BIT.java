package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class BIT extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.ZeroPage, tb("24"));
        this.instructionMap.put(AddressingMode.Absolute, tb("2C"));

        this.mnemonic = "BIT";
        this.description = "Test Bits in Memory with Accumulator";

        this.cycleMap.put(AddressingMode.ZeroPage, new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute, new CycleMeasurement(4, CycleMeasureMode.Absolute));
    }
}
