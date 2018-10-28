package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.CodeBase;
import com.lsieben.retroscript.lang.constructs.RetroScriptModule;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidModuleTypeException;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModuleValidatorTest {
    @Test
    void invalidModuleType() {
        CodeBase codeBase = TestUtils.getCodeBaseForFile("/module/invalidModuleType.rsf");
        RetroScriptModule module = codeBase.getSourceFiles().get(0).getModules().get(0);

        ModuleValidator validator = new ModuleValidator(module);
        assertThrows(InvalidModuleTypeException.class, validator::validate);
    }
}