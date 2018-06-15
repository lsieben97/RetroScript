package com.lsieben.vnes;

import com.google.gson.Gson;
import com.lsieben.vnes.lang.constructs.SourceFile;
import com.lsieben.vnes.logger.JsonLogger;
import com.lsieben.vnes.logger.Logger;
import com.lsieben.vnes.logger.XmlLogger;
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

        CommandLine commandLine = generateCommandLine(generateOptions(), args);
        // set the correct log mode.
        if (commandLine.hasOption("logmode")) {
            switch (commandLine.getOptionValue("logmode")) {
                case "json":
                    Logger.setProvider(new JsonLogger());
                    break;
                case "xml":
                    Logger.setProvider(new XmlLogger());
                    break;
                default:
                    // cli is used by default.
                    Logger.writeHeader();
                    break;
            }
        }
        if (commandLine.hasOption("help")) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("vNES",generateOptions());
            System.exit(0);
        }
        if (commandLine.hasOption("create")) {
            ProjectManager.startNewProject();
        }

        if (commandLine.hasOption("compile")) {
            Compiler.compile(commandLine);
        }
    }


    private static CommandLine generateCommandLine(
            final Options options, final String[] commandLineArguments) {
        final CommandLineParser cmdLineParser = new DefaultParser();
        CommandLine commandLine = null;
        try {
            commandLine = cmdLineParser.parse(options, commandLineArguments);
        } catch (ParseException parseException) {
            Logger.writeError("Unable to parse command-line arguments "
                    + Arrays.toString(commandLineArguments) + " due to: "
                    + parseException);
        }
        return commandLine;
    }

    private static Options generateOptions() {
        final Option verboseOption = Option.builder("v")
                .required(false)
                .hasArg(false)
                .longOpt("verbose")
                .desc("Print status with verbosity.")
                .build();
        final Option libraryOption = Option.builder("l")
                .required(false)
                .hasArg(false)
                .longOpt("library")
                .desc("Generate a vNES library file instead of a rom.")
                .build();
        final Option memstatOption = Option.builder("m")
                .required(false)
                .hasArg(false)
                .longOpt("memstat")
                .desc("Prints a memory dump of the NES memory after compiling.")
                .build();
        final Option logModeOption = Option.builder("lm")
                .required(false)
                .hasArg()
                .longOpt("logmode")
                .desc("The way vNES outputs to the console. (possible values: cli, json, xml. defaults to cli)")
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
                .hasArg()
                .desc("The path to the folder in which to create the new project.")
                .build();
        final Option outputOption = Option.builder("o")
                .required(false)
                .longOpt("output")
                .hasArg()
                .desc("The path to the .nes rom file or library to write to (wil be created if it doen't exists)")
                .build();
        final Option helpOption = Option.builder("h")
                .required(false)
                .longOpt("help")
                .hasArg(false)
                .desc("Display this help.")
                .build();
        final Options options = new Options();
        options.addOption(verboseOption);
        options.addOption(libraryOption);
        options.addOption(compileOption);
        options.addOption(createProjectOption);
        options.addOption(memstatOption);
        options.addOption(outputOption);
        options.addOption(logModeOption);
        options.addOption(helpOption);

        return options;
    }
}
