package com.lsieben.vnes.lang.constructs;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class Entity extends LanguageConstruct implements Identifier {
    private String name;
    private List<Function> functions = new ArrayList<>();
    private List<Property> properties = new ArrayList<>();

    public Entity(ParserRuleContext context) {
        super(context);
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public String getIdentifierName() {
        return name;
    }

    @Override
    public DataType getIdentifierType() {
        return new DataType(name);
    }
}
