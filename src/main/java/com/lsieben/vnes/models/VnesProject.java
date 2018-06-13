package com.lsieben.vnes.models;

public class VnesProject {

    private String name;
    private String description;
    private String author;
    private String license;
    private String version;
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

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getLicense() {
        return license;
    }

    public String getVersion() {
        return version;
    }
}
