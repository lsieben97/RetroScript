package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class STA extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("85"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("95"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("80"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("90"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedY, tb("99"));
        this.instructionMap.put(AddressingMode.IndirectX,        tb("81"));
        this.instructionMap.put(AddressingMode.IndirectY,        tb("91"));

        this.mnemonic = "STA";
        this.description = "Store Accumulator in Memory";

        this.cycleMap.put(AddressingMode.ZeroPage,         new CycleMeasurement(3, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.ZeroPageIndexedX, new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.Absolute,         new CycleMeasurement(4, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedX, new CycleMeasurement(5, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.AbsoluteIndexedY, new CycleMeasurement(5, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.IndirectX,        new CycleMeasurement(6, CycleMeasureMode.Absolute));
        this.cycleMap.put(AddressingMode.IndirectY,        new CycleMeasurement(6, CycleMeasureMode.Absolute));
    }
}
