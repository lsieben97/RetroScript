package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.Opcode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class SBC extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate,        tb("E9"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("E5"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("F5"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("ED"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("FD"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedY, tb("F9"));
        this.instructionMap.put(AddressingMode.IndirectX,        tb("E1"));
        this.instructionMap.put(AddressingMode.IndirectY,        tb("F1"));

        this.mnemonic = "SBC";
        this.description = "Subtract Memory From Accumulator With Borrow";

        this.cycleMap.put(AddressingMode.Immediate,        new CycleMeasurement(2, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPage,         new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedX, new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,         new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedX, new CycleMeasurement(4, CycleMeasureMode.AddOneOverPageBoundry));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedY, new CycleMeasurement(4, CycleMeasureMode.AddOneOverPageBoundry));
        this.cycleMap.put(AddressingMode.IndirectX,        new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.IndirectY,        new CycleMeasurement(5, CycleMeasureMode.Absolute));
    }
}
