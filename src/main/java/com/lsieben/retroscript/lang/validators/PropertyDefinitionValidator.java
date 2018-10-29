package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.PropertyAssignment;
import com.lsieben.retroscript.lang.constructs.PropertyDefinition;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidNameException;
import com.lsieben.retroscript.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class PropertyDefinitionValidator extends Validator<PropertyDefinition> {

    public PropertyDefinitionValidator(PropertyDefinition construct) {
        super(construct);
    }

    @Override
    public void validate() throws RetroScriptCompilerException {
        validateName();
        validateType();
    }

    private void validateType() throws ReferenceNotFoundException {
        if (getConstruct().getType().isId()) {
            if (!checkType(getConstruct().getType(), getConstruct().getEntity().getModule().getSourceFile())) {
                throw new ReferenceNotFoundException(getSourcePositionOfConstruct(getConstruct().getType()), "Datatype", getConstruct().getType().getName());
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
