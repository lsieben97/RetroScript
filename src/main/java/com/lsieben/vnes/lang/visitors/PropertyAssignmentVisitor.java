package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.PropertyAssignment;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class PropertyAssignmentVisitor extends vNESBaseVisitor<PropertyAssignment> {
    @Override
    public PropertyAssignment visitPropertyAssignment(vNESParser.PropertyAssignmentContext ctx) {
        PropertyAssignment propertyAssignment = new PropertyAssignment(ctx);
        propertyAssignment.setName(ctx.ID().getText());
        propertyAssignment.setValue(ctx.expression().accept(new ExpressionVisitor()));
        return propertyAssignment;
    }
}
