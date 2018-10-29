package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.CodeBase;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidNameException;
import com.lsieben.retroscript.lang.exceptions.errors.MissingPropertyException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.lsieben.retroscript.lang.constructs.Entity;

class EntityValidatorTest {
    @Test
    void validEntity() throws RetroScriptCompilerException {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/entity/validEntity.rsf");


        Entity entity = codebase.getSourceFiles().get(0).getModules().get(0).getEntities().get(0);


        EntityValidator validator = new EntityValidator(entity);
        validator.validate();
    }

    @Test
    void validEntityWithMandatoryProperties() throws RetroScriptCompilerException {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/entity/validEntityWithMandatoryProperties.rsf");


        Entity entity = codebase.getSourceFiles().get(0).getModules().get(0).getEntities().get(0);


        EntityValidator validator = new EntityValidator(entity);
        validator.validate();
    }

    @Test()
    void invalidMandatoryProperties() {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/entity/invalidMandatoryProperties.rsf");
        Entity entity = codebase.getSourceFiles().get(0).getModules().get(0).getEntities().get(0);
        EntityValidator validator = new EntityValidator(entity);
        assertThrows(MissingPropertyException.class, validator::validate);
    }

    @Test()
    void doubleEntity() {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/entity/doubleEntity.rsf");
        Entity entity = codebase.getSourceFiles().get(0).getModules().get(0).getEntities().get(0);
        EntityValidator validator = new EntityValidator(entity);
        assertThrows(InvalidNameException.class, validator::validate);
    }
}