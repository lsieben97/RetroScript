package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class DEC extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.ZeroPage,          tb("C6"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX,  tb("D6"));
        this.instructionMap.put(AddressingMode.Absolute,          tb("CE"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX,  tb("DE"));

        this.mnemonic = "DEC";
        this.description = "Decrement Memory by One";

        this.cycleMap.put(AddressingMode.ZeroPage,          new CycleMeasurement(5, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedX,  new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,          new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedX,  new CycleMeasurement(7, CycleMeasureMode.Absolute));
    }
}
