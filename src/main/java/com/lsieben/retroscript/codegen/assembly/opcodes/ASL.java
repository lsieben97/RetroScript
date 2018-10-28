package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class ASL extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Accumulator,      tb("0A"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("06"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("16"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("0E"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("1E"));

        this.mnemonic = "ASL";
        this.description = "Shift Left One Bit";

        this.cycleMap.put(AddressingMode.Accumulator,      new CycleMeasurement(2, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPage,         new CycleMeasurement(5, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedX, new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,         new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedX, new CycleMeasurement(7, CycleMeasureMode.Absolute));
    }
}
