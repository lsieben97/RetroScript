package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.Entity;
import com.lsieben.retroscript.lang.constructs.PropertyAssignment;
import com.lsieben.retroscript.lang.constructs.PropertyDefinition;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidNameException;
import com.lsieben.retroscript.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class PropertyAssignmentValidator extends Validator<PropertyAssignment> {

    public PropertyAssignmentValidator(PropertyAssignment construct) {
        super(construct);
    }

    @Override
    public void validate() throws RetroScriptCompilerException {
        validateName();
        validateBaseProperty();
    }

    private void validateBaseProperty() throws RetroScriptCompilerException {
        if (! getConstruct().getEntity().getDataType().getName().equals("ENTITY")) {
            Entity baseEntity = getEntity(getConstruct().getEntity().getDataType().getName(), getConstruct().getEntity().getModule().getSourceFile());
            PropertyDefinition baseDefinition = null;
            for (PropertyDefinition baseProperty : baseEntity.getPropertyDefinitions()) {
                if (baseProperty.getName().equals(getConstruct().getName())) {
                    baseDefinition = baseProperty;
                    break;
                }
            }

            if (baseDefinition == null) {
                throw new ReferenceNotFoundException(getSourcePositionOfConstruct(getConstruct()), "base property definition", getConstruct().getName());
            }
        }
    }

    private void validateName() throws InvalidNameException {
        int count = 0;
        for (PropertyDefinition definition : getConstruct().getEntity().getPropertyDefinitions()) {
            if (definition.getName().equals(getConstruct().getName())) {
                count++;
            }
        }

        for (PropertyAssignment assignment : getConstruct().getEntity().getPropertyAssignments()) {
            if (assignment.getName().equals(getConstruct().getName())) {
                count++;
            }
        }
        if (count > 1) {
            throw new InvalidNameException(getSourcePositionOfConstruct(getConstruct()), "PROPERTY", "multiple properties with the same name.");
        }
    }
}
