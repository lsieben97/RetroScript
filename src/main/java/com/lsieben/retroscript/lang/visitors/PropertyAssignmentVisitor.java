package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.PropertyAssignment;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

public class PropertyAssignmentVisitor extends RetroScriptBaseVisitor<PropertyAssignment> {
    @Override
    public PropertyAssignment visitPropertyAssignment(RetroScriptParser.PropertyAssignmentContext ctx) {
        PropertyAssignment propertyAssignment = new PropertyAssignment(ctx);
        propertyAssignment.setName(ctx.ID().getText());
        propertyAssignment.setValue(ctx.expression().accept(new ExpressionVisitor()));
        return propertyAssignment;
    }
}
