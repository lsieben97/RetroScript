package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.Opcode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class LDX extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate,        tb("A2"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("A6"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedY, tb("B6"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("AE"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedY, tb("BE"));


        this.mnemonic = "LDX";
        this.description = "Load Index X with Memory";

        this.cycleMap.put(AddressingMode.Implied,          new CycleMeasurement(2, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPage,         new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedY, new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,         new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedY, new CycleMeasurement(4, CycleMeasureMode.AddOneOverPageBoundry));
    }
}
