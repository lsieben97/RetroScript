package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class STX extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("86"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedY, tb("96"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("8E"));

        this.mnemonic = "STX";
        this.description = "Store Index X in Memory";

        this.cycleMap.put(AddressingMode.ZeroPage,         new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedY, new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,         new CycleMeasurement(4, CycleMeasureMode.Absolute));
    }
}
