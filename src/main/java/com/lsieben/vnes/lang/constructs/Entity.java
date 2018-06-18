package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class Entity extends LanguageConstruct {
    private String name;
    private DataType dataType;
    private List<Function> functions = new ArrayList<>();
    private List<PropertyAssignment> propertyAssignments = new ArrayList<>();
    private List<PropertyDefinition> propertyDefinitions = new ArrayList<>();

    public Entity(ParserRuleContext context) {
        super(context);
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public List<PropertyAssignment> getPropertyAssignments() {
        return propertyAssignments;
    }

    public void setPropertyAssignments(List<PropertyAssignment> properties) {
        this.propertyAssignments = properties;
    }

    public List<PropertyDefinition> getPropertyDefinitions() {
        return propertyDefinitions;
    }

    public void setPropertyDefinitions(List<PropertyDefinition> propertyDefinitions) {
        this.propertyDefinitions = propertyDefinitions;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public String getName() {
        return name;
    }
}
