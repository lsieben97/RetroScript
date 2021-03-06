package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class LDY extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate,        tb("A0"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("A4"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("B4"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("AC"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("BC"));


        this.mnemonic = "LDY";
        this.description = "Load Index Y with Memory";

        this.cycleMap.put(AddressingMode.Immediate,        new CycleMeasurement(2, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPage,         new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedX, new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,         new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedX, new CycleMeasurement(4, CycleMeasureMode.AddOneOverPageBoundry));
    }
}
