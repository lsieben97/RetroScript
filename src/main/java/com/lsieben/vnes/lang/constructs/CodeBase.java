package com.lsieben.vnes.lang.constructs;

import com.lsieben.vnes.lang.exceptions.vNESCompilerException;
import com.lsieben.vnes.models.VnesProject;

import javax.xml.transform.Source;
import java.util.List;

public class CodeBase {
    private static CodeBase current;

    private VnesProject project;
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

    public VnesProject getProject() {
        return project;
    }

    public void setProject(VnesProject project) {
        this.project = project;
    }

    public void validate() throws vNESCompilerException {
        for (SourceFile sourceFile : sourceFiles) {
            sourceFile.getValidator().validate();
        }
    }

    public boolean hasModule(String name) {
        for (SourceFile sourceFile : sourceFiles)
        for(vNESModule module : sourceFile.getModules()) {
            if (module.getModuleName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
