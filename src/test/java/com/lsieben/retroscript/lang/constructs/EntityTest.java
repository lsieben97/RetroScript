package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.visitors.EntityVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;
import com.lsieben.retroscript.test_utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntityTest {

    @Test
    void emptyEntity() {
        String code = TestUtils.getFileFromResource("/entity/emptyEntity.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        Entity entity = new EntityVisitor().visitEntity(parser.entity());
        assertNotNull(entity, "Entity was not recognized by parser");
        assertEquals(entity.getName(), "TEST", "Entity Name is not correct.");
        assertEquals(entity.getDataType().getName(), "SCREEN", "Entity datatype is not SCREEN");
    }

    @Test
    void entityWithPropertyAssignment() {
        String code = TestUtils.getFileFromResource("/entity/entityWithPropertyAssignment.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        Entity entity = new EntityVisitor().visitEntity(parser.entity());
        assertNotNull(entity, "Entity was not recognized by parser");
        assertEquals(entity.getName(), "TEST", "Entity Name is not correct.");
        assertEquals(entity.getPropertyAssignments().size(), 1, "Entity does not have 1 property assignment.");
    }

    @Test
    void entityWithPropertyDefinition() {
        String code = TestUtils.getFileFromResource("/entity/entityWithPropertyDefinition.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        Entity entity = new EntityVisitor().visitEntity(parser.entity());
        assertNotNull(entity, "Entity was not recognized by parser");
        assertEquals(entity.getName(), "TEST", "Entity Name is not correct.");
        assertEquals(entity.getPropertyDefinitions().size(), 1, "Entity does not have 1 property definition.");
    }

    @Test
    void entityWithFunction() {
        String code = TestUtils.getFileFromResource("/entity/entityWithFunction.vns");
        RetroScriptParser parser = TestUtils.getParserForString(code);

        Entity entity = new EntityVisitor().visitEntity(parser.entity());
        assertNotNull(entity, "Entity was not recognized by parser");
        assertEquals(entity.getName(), "TEST", "Entity Name is not correct.");
        assertEquals(entity.getFunctions().size(), 1, "Entity does not have 1 function.");
    }
}