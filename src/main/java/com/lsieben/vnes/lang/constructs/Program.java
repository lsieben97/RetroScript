package com.lsieben.vnes.lang.constructs;

import java.util.List;

public class Program {

    private List<Module> modules;
    private List<Entity> entities;


    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public boolean hasModules() {
        return this.modules != null;
    }

    public boolean hasEntities() {
        return this.entities != null;
    }
}
