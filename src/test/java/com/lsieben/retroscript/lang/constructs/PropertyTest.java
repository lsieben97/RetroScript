package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.PropertyAssignmentVisitor;
import com.lsieben.retroscript.lang.visitors.PropertyDefinitionVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyTest {

    @Test
    void propertyAssignment() {
        String code = TestUtils.getFileFromResource("/property/assignment.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        PropertyAssignment property = new PropertyAssignmentVisitor().visitPropertyAssignment(parser.propertyAssignment());
        assertNotNull(property, "Property assignment was not recognized by parser.");
        assertEquals(property.getName(), "test", "Property does not have test as name.");
        assertEquals(property.getValue().getAtom().getInteger(), 1, "Value of property is not 1.");
    }

    @Test
    void propertyDefinition() {
        String code = TestUtils.getFileFromResource("/property/definition.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        PropertyDefinition property = new PropertyDefinitionVisitor().visitPropertyDefinition(parser.propertyDefinition());
        assertNotNull(property, "Property definition was not recognized by parser.");
        assertEquals(property.getName(), "test", "Property does not have test as name.");
        assertEquals(property.isMandatory(), false, "Property is mandatory.");
        assertEquals(property.getValue().getAtom().getInteger(), 1, "Value of property is not 1.");
    }

    @Test
    void mandatoryPropertyDefinition() {
        String code = TestUtils.getFileFromResource("/property/mandatoryDefinition.rsf");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        PropertyDefinition property = new PropertyDefinitionVisitor().visitPropertyDefinition(parser.propertyDefinition());
        assertNotNull(property, "Property definition was not recognized by parser.");
        assertEquals(property.getName(), "test", "Property does not have test as name.");
        assertEquals(property.isMandatory(), true, "Property is not mandatory.");
        assertEquals(property.getValue().getAtom().getInteger(), 1, "Value of property is not 1.");
    }
}