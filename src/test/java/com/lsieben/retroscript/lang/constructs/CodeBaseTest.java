package com.lsieben.retroscript.lang.constructs;

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
        RetroScriptModule module = new RetroScriptModule(new ParserRuleContext());
        module.setModuleName("VNES");
        sourceFile.getModules().add(module);
        codeBase.setSourceFiles(new ArrayList<>());
        codeBase.getSourceFiles().add(sourceFile);

        assertEquals(codeBase.hasModule("VNES"), true, "code base doesn't have VNES module.");
        assertEquals(codeBase.hasModule("vnes"), false, "code base does have vnes module.");
    }
}