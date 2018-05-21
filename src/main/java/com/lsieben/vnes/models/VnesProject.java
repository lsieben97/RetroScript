package com.lsieben.vnes.models;

public class VnesProject {

    private String name;
    private String projectFolder;
    private String sourceDir;
    private String[] libraries;

    public VnesProject() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectFolder() {
        return projectFolder;
    }

    public void setProjectFolder(String projectFolder) {
        this.projectFolder = projectFolder;
    }

    public String getSourceDir() {
        return sourceDir;
    }

    public String[] getLibraries() {
        return libraries;
    }

    public void setLibraries(String[] libraries) {
        this.libraries = libraries;
    }

    public void setSourceDir(String sourceDir) {
        this.sourceDir = sourceDir;
    }

    @Override
    public String toString() {
        return "Name:\t\t\t" + this.name + "\n" +
                "Project folder:\t" + this.projectFolder + "\n" +
                "Source folder:\t" + this.sourceDir;
    }
}
