package com.lsieben.vnes.codegen.assembly.opcodes;

import com.lsieben.vnes.codegen.assembly.AddressingMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasureMode;
import com.lsieben.vnes.codegen.assembly.CycleMeasurement;
import com.lsieben.vnes.codegen.assembly.Opcode;

import static com.lsieben.vnes.codegen.assembly.Util.tb;

public class INC extends Opcode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.ZeroPage,          tb("E6"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX,  tb("F6"));
        this.instructionMap.put(AddressingMode.Absolute,          tb("EE"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX,  tb("FE"));

        this.mnemonic = "INC";
        this.description = "Increment Memory by One";

        this.cycleMap.put(AddressingMode.ZeroPage,          new CycleMeasurement(5, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedX,  new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,          new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedX,  new CycleMeasurement(7, CycleMeasureMode.Absolute));
    }
}
