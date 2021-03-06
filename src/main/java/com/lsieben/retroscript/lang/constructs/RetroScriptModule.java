package com.lsieben.retroscript.lang.constructs;

import com.lsieben.retroscript.lang.validators.ModuleValidator;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class RetroScriptModule extends LanguageConstruct {

    private String moduleName;
    private ModuleType type;
    private SourceFile sourceFile;
    private List<Entity> entities;
    private List<Function> functions;

    public RetroScriptModule(ParserRuleContext context) {
        super(context);
        setValidator(new ModuleValidator(this));
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ModuleType getType() {
        return type;
    }

    public void setType(ModuleType type) {
        this.type = type;
    }

    public SourceFile getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(SourceFile sourceFile) {
        this.sourceFile = sourceFile;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }

    public boolean hasDataType(DataType type) {
        for (Entity entity : getEntities()) {
            if (entity.getDataType().getName().equals("ENTITY") && entity.getName().equals(type.getName())) {
                return true;
            }
        }
        return false;
    }
}
