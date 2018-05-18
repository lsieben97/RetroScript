package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class ROL extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Accumulator,      tb("2A"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("26"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("36"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("2E"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("3E"));


        this.mnemonic = "ROL";
        this.description = "Rotate One Bit Left. Memory or Accumulator";

        this.cycleMap.put(AddressingMode.Accumulator,      new CycleMeasurement(2, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPage,         new CycleMeasurement(5, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedX, new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,         new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedX, new CycleMeasurement(7, CycleMeasureMode.Absolute));
    }
}
