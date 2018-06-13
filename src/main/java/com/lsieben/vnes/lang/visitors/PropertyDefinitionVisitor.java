package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.Property;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class PropertyDefinitionVisitor extends vNESBaseVisitor<Property> {

    @Override
    public Property visitPropertyDefinition(vNESParser.PropertyDefinitionContext ctx) {
        Property property = new Property(ctx);

        property.setName(ctx.ID().getText());
        property.setValue(ctx.expression().accept(new ExpressionVisitor()));
        property.setType(ctx.dataType().accept(new DataTypeVisitor()));
        if (ctx.mandatoryModifier() != null) {
            property.setMandatory(true);
        }

        return property;
    }
}
