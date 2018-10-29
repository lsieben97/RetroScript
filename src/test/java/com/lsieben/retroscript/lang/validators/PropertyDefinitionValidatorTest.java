package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.CodeBase;
import com.lsieben.retroscript.lang.constructs.PropertyDefinition;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidNameException;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyDefinitionValidatorTest {
    @Test
    void validAssignment() throws RetroScriptCompilerException {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/property/validDefinition.rsf");
        PropertyDefinition definition = codebase.getSourceFiles().get(0).getModules().get(0).getEntities().get(0).getPropertyDefinitions().get(0);
        PropertyDefinitionValidator validator = new PropertyDefinitionValidator(definition);
        validator.validate();
    }

    @Test()
    void invalidMandatoryProperties() {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/property/invalidDefinition.rsf");
        PropertyDefinition assignment = codebase.getSourceFiles().get(0).getModules().get(0).getEntities().get(0).getPropertyDefinitions().get(0);
        PropertyDefinitionValidator validator = new PropertyDefinitionValidator(assignment);
        assertThrows(InvalidNameException.class, validator::validate);
    }
}