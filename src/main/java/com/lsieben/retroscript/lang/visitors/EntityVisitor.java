package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.Entity;
import com.lsieben.retroscript.lang.constructs.Function;
import com.lsieben.retroscript.lang.constructs.PropertyAssignment;
import com.lsieben.retroscript.lang.constructs.PropertyDefinition;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EntityVisitor extends RetroScriptBaseVisitor<Entity> {
    @Override
    public Entity visitEntity(RetroScriptParser.EntityContext ctx) {
        Entity entity = new Entity(ctx);

        entity.setName(ctx.entityDefinition().ID().getText());
        entity.setDataType(ctx.entityDefinition().dataType().accept(new DataTypeVisitor()));

        List<Function> functions = ctx.function().stream().map(function -> function.accept(new FunctionVisitor())).collect(Collectors.toList());

        for (Function function : functions) {
            function.setEntity(entity);
        }

        entity.setFunctions(functions);

        List<PropertyAssignment> propertyAssignments = ctx.propertyAssignment().stream().map(propertyAssignment -> propertyAssignment.accept(new PropertyAssignmentVisitor())).collect(Collectors.toList());
        List<PropertyDefinition> propertyDefinitions = ctx.propertyDefinition().stream().map(propertyDefinition -> propertyDefinition.accept(new PropertyDefinitionVisitor())).collect(Collectors.toList());

        entity.setPropertyAssignments(new ArrayList<>());
        entity.setPropertyDefinitions(new ArrayList<>());

        for (PropertyAssignment propertyAssignment : propertyAssignments) {
            propertyAssignment.setEntity(entity);
        }

        for (PropertyDefinition propertyDefinition : propertyDefinitions) {
            propertyDefinition.setEntity(entity);
        }

        entity.getPropertyAssignments().addAll(propertyAssignments);
        entity.getPropertyDefinitions().addAll(propertyDefinitions);

        return entity;
    }
}
