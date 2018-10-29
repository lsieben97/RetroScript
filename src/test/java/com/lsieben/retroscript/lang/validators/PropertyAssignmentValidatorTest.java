package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.CodeBase;
import com.lsieben.retroscript.lang.constructs.PropertyAssignment;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidNameException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyAssignmentValidatorTest {
    @Test
    void validAssignment() throws RetroScriptCompilerException {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/property/validAssignment.rsf");
        PropertyAssignment assignment = codebase.getSourceFiles().get(0).getModules().get(0).getEntities().get(0).getPropertyAssignments().get(0);
        PropertyAssignmentValidator validator = new PropertyAssignmentValidator(assignment);
        validator.validate();
    }

    @Test()
    void invalidMandatoryProperties() {
        CodeBase codebase = TestUtils.getCodeBaseForFile("/property/invalidAssignment.rsf");
        PropertyAssignment assignment = codebase.getSourceFiles().get(0).getModules().get(0).getEntities().get(0).getPropertyAssignments().get(0);
        PropertyAssignmentValidator validator = new PropertyAssignmentValidator(assignment);
        assertThrows(InvalidNameException.class, validator::validate);
    }
}