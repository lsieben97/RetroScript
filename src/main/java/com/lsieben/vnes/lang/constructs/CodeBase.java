package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.Scope;
import com.lsieben.vnes.models.VnesProject;

import java.util.List;

public class CodeBase {
    private static CodeBase current;

    private VnesProject project;
    private Scope scope;
    private List<SourceFile> sourceFiles;

    public static CodeBase getCurrent() {
        return current;
    }

    public static void setCurrent(CodeBase current) {
        CodeBase.current = current;
    }

    public List<SourceFile> getSourceFiles() {
        return sourceFiles;
    }

    public void setSourceFiles(List<SourceFile> sourceFiles) {
        this.sourceFiles = sourceFiles;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public VnesProject getProject() {
        return project;
    }

    public void setProject(VnesProject project) {
        this.project = project;
    }
}
