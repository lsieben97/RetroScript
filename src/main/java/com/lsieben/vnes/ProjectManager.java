package com.lsieben.vnes;

import com.google.gson.Gson;
import com.lsieben.vnes.models.VnesProject;
import com.sun.media.jfxmedia.logging.Logger;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjectManager {

    public static void startNewProject() {
        Scanner scanner = new Scanner(System.in);
        VnesProject project = new VnesProject();
        System.out.println("Enter the name of the project:");
        project.setName(scanner.nextLine());
        System.out.println("Enter directory to create the project in");
        project.setProjectFolder(scanner.nextLine());
        project.setSourceDir("./src");
        System.out.println("The following project will be created:");
        System.out.println(project.toString());
        pressEnterKeyToContinue();
        System.out.println("Creating project...");
        createProject(project);

    }
    private static void pressEnterKeyToContinue()
    {
        System.out.println("Press the enter key to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    private static void createProject(VnesProject project) {
        File projectDir = new File(project.getProjectFolder());
        if (!projectDir.exists()) {
            if (!projectDir.mkdirs()) {
                com.lsieben.vnes.logger.Logger.writeError("Could not create project directory");
            }

            File projectSourceDir = new File(project.getProjectFolder() + File.separator + project.getSourceDir() + File.separator);
            if (!projectSourceDir.mkdirs()) {
                com.lsieben.vnes.logger.Logger.writeError("Could not create project source directory");
            }
            try {
                PrintWriter writer = new PrintWriter(project.getProjectFolder() + File.separator + project.getName() + ".vnesproj", "UTF-8");
                writer.print(new Gson().toJson(project));
                writer.close();
              } catch (IOException ex) {
                com.lsieben.vnes.logger.Logger.writeError("Could not create project definition file");
            }
            String[] templateDirs = {"music", "sounds", "screens", "sprites", "functions"};

            for(String dirPath : templateDirs) {
                File dir = new File(project.getProjectFolder() + File.separator + project.getSourceDir() + File.separator + dirPath + File.separator);
                if (!dir.mkdirs()) {
                    com.lsieben.vnes.logger.Logger.writeError("Could not create project template folder '" + dir.getPath() + "'");
                }
            }
            System.out.println("Project '" + project.getName() + "' created.");
        }
    }

    public static VnesProject makeProjectFromDefinition(String path) {
        File definitionFile = new File(path);
        if (definitionFile.exists() && definitionFile.canRead()) {
            try {
                String definitionString = FileUtils.readFileToString(definitionFile, "utf-8");
                try {
                    return new Gson().fromJson(definitionString, VnesProject.class);
                } catch (Exception ex) {
                    com.lsieben.vnes.logger.Logger.writeError("invalid project definition format.");
                }
            } catch(IOException ex) {
                com.lsieben.vnes.logger.Logger.writeError("Cannot read definition file '" + path + "':" +  ex.getMessage());
            }
        } else {
            com.lsieben.vnes.logger.Logger.writeError("Definition file '" + path + "' does not exists or is not readable.");
        }
        return null;
    }

    public static List<File> getSourceFilesForProject(VnesProject project) {
        List<File> sourceFiles = new ArrayList<>();
        searchForSourceFiles(new File(project.getSourceDir()), sourceFiles);
        return sourceFiles;
    }

    private static void searchForSourceFiles(File root, List<File> datOnly) {
        if(root == null || datOnly == null) return;
        if(root.isDirectory()) {
            for(File file : root.listFiles()) {
                searchForSourceFiles(file, datOnly);
            }
        } else if(root.isFile() && (root.getName().endsWith(".vns") || root.getName().endsWith(".vnes"))) {
            datOnly.add(root);
        }
    }
}
