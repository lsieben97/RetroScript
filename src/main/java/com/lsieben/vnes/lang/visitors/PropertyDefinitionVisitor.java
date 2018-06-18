package com.lsieben.vnes.lang.visitors;

import com.lsieben.vnes.lang.constructs.PropertyDefinition;
import com.lsieben.vnes.parser.generated.vNESBaseVisitor;
import com.lsieben.vnes.parser.generated.vNESParser;

public class PropertyDefinitionVisitor extends vNESBaseVisitor<PropertyDefinition> {

    @Override
    public PropertyDefinition visitPropertyDefinition(vNESParser.PropertyDefinitionContext ctx) {
        PropertyDefinition propertyDefinition = new PropertyDefinition(ctx);

        propertyDefinition.setName(ctx.ID().getText());
        propertyDefinition.setValue(ctx.expression().accept(new ExpressionVisitor()));
        propertyDefinition.setType(ctx.dataType().accept(new DataTypeVisitor()));
        if (ctx.mandatoryModifier() != null) {
            propertyDefinition.setMandatory(true);
        }

        return propertyDefinition;
    }
}
