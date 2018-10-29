package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.validators.PropertyAssignmentValidator;
import org.antlr.v4.runtime.ParserRuleContext;

public class PropertyAssignment extends LanguageConstruct {

    private String name;
    private DataType type;
    private Expression value;
    private Entity entity;

    public PropertyAssignment(ParserRuleContext context) {
        super(context);
        setValidator(new PropertyAssignmentValidator(this));
    }

    public Expression getValue() {
        return value;
    }

    public void setValue(Expression value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
