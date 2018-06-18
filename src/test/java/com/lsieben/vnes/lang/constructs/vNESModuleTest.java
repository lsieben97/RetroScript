package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.visitors.ModuleVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;
import com.lsieben.vnes.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class vNESModuleTest {
    @Test
    void emptyModule() {
        String code = TestUtils.getFileFromResource("/module/emptyModule.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        vNESModule module = new ModuleVisitor().visitModule(parser.module());
        assertNotNull(module, "Module was not recognized by parser");
        assertEquals(module.getModuleName(), "TEST", "Module Name is not correct");
        assertEquals(module.getType(), ModuleType.Normal, "Module type is not normal");
    }

    @Test
    void emptyNativeModule() {
        String code = TestUtils.getFileFromResource("/module/emptyNativeModule.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        vNESModule module = new ModuleVisitor().visitModule(parser.module());
        assertNotNull(module, "Module was not recognized by parser");
        assertEquals(module.getModuleName(), "TEST", "Module Name is not correct");
        assertEquals(module.getType(), ModuleType.Native, "Module type is not native");
    }

    @Test
    void moduleWithEntity() {
        String code = TestUtils.getFileFromResource("/module/moduleWithEntity.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        vNESModule module = new ModuleVisitor().visitModule(parser.module());
        assertNotNull(module, "Module was not recognized by parser");
        assertEquals(module.getModuleName(), "TEST", "Module Name is not correct.");
        assertEquals(module.getEntities().size(), 1, "Module has not 1 entity.");
    }

    @Test
    void moduleWithFunction() {
        String code = TestUtils.getFileFromResource("/module/moduleWithFunction.vns");
        vNESParser parser = TestUtils.getParserForString(code);

        vNESModule module = new ModuleVisitor().visitModule(parser.module());
        assertNotNull(module, "Module was not recognized by parser");
        assertEquals(module.getModuleName(), "TEST", "Module Name is not correct.");
        assertEquals(module.getFunctions().size(), 1, "Module has not 1 function.");
    }
}