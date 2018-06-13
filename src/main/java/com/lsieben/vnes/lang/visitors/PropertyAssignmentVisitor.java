package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.Property;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class PropertyAssignmentVisitor extends vNESBaseVisitor<Property> {
    @Override
    public Property visitPropertyAssignment(vNESParser.PropertyAssignmentContext ctx) {
        Property property = new Property(ctx);
        property.setName(ctx.ID().getText());
        property.setValue(ctx.expression().accept(new ExpressionVisitor()));
        return property;
    }
}
