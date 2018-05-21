package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class LDA extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate,        tb("A9"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("A5"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("B5"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("AD"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("BD"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedY, tb("B9"));
        this.instructionMap.put(AddressingMode.IndirectX,        tb("A1"));
        this.instructionMap.put(AddressingMode.IndirectY,        tb("B1"));

        this.mnemonic = "LDA";
        this.description = "Load Accumulator";

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
