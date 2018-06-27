package com.lsieben.retroscript.lang.visitors;

import com.lsieben.retroscript.lang.constructs.PropertyDefinition;
import com.lsieben.retroscript.parser.generated.RetroScriptBaseVisitor;
import com.lsieben.retroscript.parser.generated.RetroScriptParser;

public class PropertyDefinitionVisitor extends RetroScriptBaseVisitor<PropertyDefinition> {

    @Override
    public PropertyDefinition visitPropertyDefinition(RetroScriptParser.PropertyDefinitionContext ctx) {
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
