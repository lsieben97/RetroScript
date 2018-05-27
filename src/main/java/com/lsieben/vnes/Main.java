package com.lsieben.vnes;

import com.google.gson.Gson;
import com.lsieben.vnes.lang.constructs.SourceFile;
import com.lsieben.vnes.logger.Logger;
import com.lsieben.vnes.models.VnesProject;
import com.lsieben.vnes.parser.Parser;
import org.apache.commons.cli.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Logger.start(2);
        Logger.writeHeader();
        CommandLine commandLine = generateCommandLine(generateOptions(), args);

        if (commandLine.hasOption("create")) {
            ProjectManager.startNewProject();
        }

        if (commandLine.hasOption("compile")) {
            if (commandLine.hasOption("output") || commandLine.hasOption("library")) {
                String input = commandLine.getOptionValue("compile");
                if(commandLine.hasOption("output")) {
                    String output = commandLine.getOptionValue("output");
                    // compile to rom
                    VnesProject project = ProjectManager.makeProjectFromDefinition(input);
                    if (project != null) {
                        Logger.writeInfo("Starting ROM compilation for project '" + project.getName() + "'");
                        // compile rom...
                    }
                } else {
                    // compile to library
                    String library = commandLine.getOptionValue("library");
                    VnesProject project = ProjectManager.makeProjectFromDefinition(input);
                    if (project != null) {
                        Logger.writeInfo("Starting Library compilation for project '" + project.getName() + "'");
                        // compile library...
                        List<SourceFile> codeBase = new ArrayList<>();
                        List<File> sourcefiles = ProjectManager.getSourceFilesForProject(project);
                        for( File file : sourcefiles) {
                            codeBase.add(Parser.parseFile(file));
                        }
                        // todo validate id's in each sourceFile

                        // Write codebase to a file.
                        String codebaseString = new Gson().toJson(codeBase.toArray());
                        
                    }
                }

            } else {
                Logger.writeError("argument 'compile' requires argument 'output' or 'library' to be present");
            }
        }
        //com.lsieben.vnes.compiler.Compiler compiler = new com.lsieben.vnes.compiler.Compiler(args);
        //compiler.start();
    }

    private static CommandLine generateCommandLine(
            final Options options, final String[] commandLineArguments)
    {
        final CommandLineParser cmdLineParser = new DefaultParser();
        CommandLine commandLine = null;
        try
        {
            commandLine = cmdLineParser.parse(options, commandLineArguments);
        }
        catch (ParseException parseException)
        {
            Logger.writeError("Unable to parse command-line arguments "
                    + Arrays.toString(commandLineArguments) + " due to: "
                    + parseException);
        }
        return commandLine;
    }

    private static Options generateOptions()
    {
        final Option verboseOption = Option.builder("v")
                .required(false)
                .hasArg(false)
                .longOpt("verbose")
                .desc("Print status with verbosity.")
                .build();
        final Option libraryOption = Option.builder("l")
                .required(false)
                .hasArg()
                .longOpt("library")
                .desc("Generate a vNES library file instead of a rom.")
                .build();
        final Option memstatOption = Option.builder("m")
                .required(false)
                .hasArg(false)
                .longOpt("memstat")
                .desc("Prints a memory dump of the NES memory instead of compiling.")
                .build();
        final Option compileOption = Option.builder("c")
                .required(false)
                .longOpt("compile")
                .hasArg()
                .desc("The path to the vNES Project definition to compile.")
                .build();
        final Option createProjectOption = Option.builder("cr")
                .required(false)
                .longOpt("create")
                .hasArg(false)
                .desc("The path to the folder in which to create the new project.")
                .build();
        final Option outputOption = Option.builder("o")
                .required(false)
                .longOpt("output")
                .hasArg(false)
                .desc("The path to the .nes rom file of library to write to (wil be created if it doen't exists)")
                .build();
        final Options options = new Options();
        options.addOption(verboseOption);
        options.addOption(libraryOption);
        options.addOption(compileOption);
        options.addOption(createProjectOption);
        options.addOption(memstatOption);
        options.addOption(outputOption);

        return options;
    }
}
