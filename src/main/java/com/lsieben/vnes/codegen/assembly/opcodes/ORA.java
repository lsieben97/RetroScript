package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class ORA extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate,        tb("09"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("05"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("15"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("0D"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("1D"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedY, tb("19"));
        this.instructionMap.put(AddressingMode.IndirectX,        tb("01"));
        this.instructionMap.put(AddressingMode.IndirectY,        tb("11"));

        this.mnemonic = "ORA";
        this.description = "OR Memory with Accumulator";

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
