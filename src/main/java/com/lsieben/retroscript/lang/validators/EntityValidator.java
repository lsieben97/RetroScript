package com.lsieben.retroscript.lang.validators;

import com.lsieben.retroscript.lang.constructs.Entity;
import com.lsieben.retroscript.lang.constructs.PropertyAssignment;
import com.lsieben.retroscript.lang.constructs.PropertyDefinition;
import com.lsieben.retroscript.lang.exceptions.errors.InvalidNameException;
import com.lsieben.retroscript.lang.exceptions.errors.MissingPropertyException;
import com.lsieben.retroscript.lang.exceptions.errors.ReferenceNotFoundException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;

public class EntityValidator extends Validator<Entity> {
     public EntityValidator(Entity construct) {
        super(construct);
    }

    @Override
    public void validate() throws RetroScriptCompilerException {
        validateName();
        validateDataType();
        validateMandatoryProperties();
        validatePropertyDefinitions();
        validatePropertyAssignments();

    }

    private void validatePropertyAssignments() throws RetroScriptCompilerException {
        for (PropertyAssignment assignment : getConstruct().getPropertyAssignments()) {
            assignment.getValidator().validate();
        }
    }

    private void validatePropertyDefinitions() throws RetroScriptCompilerException {
        for (PropertyDefinition definition : getConstruct().getPropertyDefinitions()) {
            definition.getValidator().validate();
        }
    }

    private void validateMandatoryProperties() throws RetroScriptCompilerException {
        if (! getConstruct().getDataType().getName().equals("ENTITY")) {
            Entity baseEntity = getEntity(getConstruct().getDataType().getName(), getConstruct().getModule().getSourceFile());
            for (PropertyDefinition baseProperty : baseEntity.getPropertyDefinitions()) {
                if (baseProperty.isMandatory()) {
                    boolean found = false;
                    for (PropertyAssignment property : getConstruct().getPropertyAssignments()) {
                        if (property.getName().equals(baseProperty.getName())) {
                            found = true;
                            break;
                        }
                    }
                    if (! found) {
                        throw new MissingPropertyException(getSourcePositionOfConstruct(getConstruct()), getConstruct().getName(), baseProperty.getName());
                    }
                }
            }
        }
    }

    private void validateDataType() throws ReferenceNotFoundException {
         if (! getConstruct().getDataType().getName().equals("ENTITY")) {
             if (!checkType(getConstruct().getDataType(), getConstruct().getModule().getSourceFile())) {
                 throw new ReferenceNotFoundException(getSourcePositionOfConstruct(getConstruct().getDataType()), "Datatype", getConstruct().getDataType().getName());
             }
         }
    }

    private void validateName() throws InvalidNameException {
        if (checkEntityName(getConstruct())) {
            throw new InvalidNameException(getSourcePositionOfConstruct(getConstruct()), "ENTITY", "multiple entities with the same name.");
        }
    }
}



