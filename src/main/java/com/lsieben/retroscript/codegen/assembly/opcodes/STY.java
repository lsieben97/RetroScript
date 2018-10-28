package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class STY extends OpCode {
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
