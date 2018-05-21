package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.Program;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class ProgramVisitor extends vNESBaseVisitor<Program> {

    @Override
    public Program visitProgram(vNESParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }
}
