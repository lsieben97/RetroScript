package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CodeBaseTest {

    @Test
    void hasModule() {

        CodeBase codeBase = new CodeBase();
        SourceFile sourceFile = new SourceFile(new ParserRuleContext());
        sourceFile.setModules(new ArrayList<>());
        vNESModule module = new vNESModule(new ParserRuleContext());
        module.setModuleName("VNES");
        sourceFile.getModules().add(module);
        codeBase.setSourceFiles(new ArrayList<>());
        codeBase.getSourceFiles().add(sourceFile);

        assertEquals(codeBase.hasModule("VNES"), true, "code base doesn't have VNES module.");
        assertEquals(codeBase.hasModule("vnes"), false, "code base does have vnes module.");
    }
}