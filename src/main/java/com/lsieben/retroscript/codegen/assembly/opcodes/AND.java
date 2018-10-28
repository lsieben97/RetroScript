package com.lsieben.retroscript.codegen.assembly.opcodes;

import com.lsieben.retroscript.codegen.assembly.AddressingMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasureMode;
import com.lsieben.retroscript.codegen.assembly.CycleMeasurement;
import com.lsieben.retroscript.codegen.assembly.OpCode;

import static com.lsieben.retroscript.codegen.assembly.Util.tb;

public class AND extends OpCode {
    @Override
    protected void initialize() {
        this.instructionMap.put(AddressingMode.Immediate,        tb("29"));
        this.instructionMap.put(AddressingMode.ZeroPage,         tb("25"));
        this.instructionMap.put(AddressingMode.ZeroPageIndexedX, tb("35"));
        this.instructionMap.put(AddressingMode.Absolute,         tb("2D"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedX, tb("3D"));
        this.instructionMap.put(AddressingMode.AbsoluteIndexedY, tb("39"));
        this.instructionMap.put(AddressingMode.IndirectX,        tb("21"));
        this.instructionMap.put(AddressingMode.IndirectY,        tb("31"));

        this.mnemonic = "AND";
        this.description = "AND Memory with Accumulator";

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
