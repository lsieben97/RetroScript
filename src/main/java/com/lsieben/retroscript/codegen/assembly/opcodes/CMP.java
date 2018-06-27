package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.Opcode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class CMP extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate,        tb("C9"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("C5"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("D5"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("CD"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("DD"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedY, tb("D9"));
        this.instructionMap.put(AddressingMode.IndirectX,        tb("C1"));
        this.instructionMap.put(AddressingMode.IndirectY,        tb("D1"));

        this.mnemonic = "CMP";
        this.description = "Compare Memory and Accumulator";

        this.cycleMap.put(AddressingMode.Immediate,        new CycleMeasurement(2, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPage,         new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedX, new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,         new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedX, new CycleMeasurement(4, CycleMeasureMode.AddOneOverPageBoundry));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedY, new CycleMeasurement(4, CycleMeasureMode.AddOneOverPageBoundry));
        this.cycleMap.put(AddressingMode.IndirectX,        new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.IndirectY,        new CycleMeasurement(5, CycleMeasureMode.AddOneOverPageBoundry));
    }
}
