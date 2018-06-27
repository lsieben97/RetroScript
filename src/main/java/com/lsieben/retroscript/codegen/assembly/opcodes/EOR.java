package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.Opcode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class EOR extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate,        tb("49"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("45"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("55"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("40"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("50"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedY, tb("59"));
        this.instructionMap.put(AddressingMode.IndirectX,        tb("41"));
        this.instructionMap.put(AddressingMode.IndirectY,        tb("51"));

        this.mnemonic = "EOR";
        this.description = "'Exclusive-Or' Memory with Accumulator";

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
