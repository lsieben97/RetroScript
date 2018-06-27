package com.lsieben.retroscript.logger;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;
import com.lsieben.retroscript.Compiler;
import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;
import com.lsieben.retroscript.lang.exceptions.vNESWarning;

/**
 * Logger class to write stuff to the console.
 */
public class Logger {
    /**
     * Colored printer to write with color.
     */
    private static ColoredPrinter cp;

    private static LoggingProvider provider = new CliLogger();

    /**
     * Start the logger with the given level.
     * @param level The level to log at.
     */
    public static void start(int level) {
        cp = new ColoredPrinter.Builder(level, false)
                .foreground(Ansi.FColor.WHITE).background(Ansi.BColor.BLACK)   //setting format
                .build();
    }

    /**
     * Write a debug message to the console.
     * @param message The message to write.
     */
    public static void writeDebug(String message) {
        cp.println(provider.getDebug(message));
    }

    /**
     * Write a debug message to the console.
     * @param message The message to write.
     */
    public static void writeInfo(String message) {
        cp.println(provider.getInfo(message));
    }

    /**
     * Write a debug message to the console.
     * @param message The message to write.
     */
    public static void writeWarning(String message) {
        cp.println(provider.getWarning(message));
    }

    /**
     * Write a debug message to the console.
     * @param message The message to write.
     */
    public static void writeWarning(vNESWarning message) {
        cp.println(provider.getWarning(message));
    }

    /**
     * Write a debug message to the console and exit.
     * @param message The message to write.
     */
    public static void writeError(String message) {
        writeError(message, true);
    }

    /**
     * Write a debug message to the console and exit.
     * @param message The message to write.
     */
    public static void writeError(String message, boolean exit) {
        cp.debugPrintln(provider.getError(message));
        if (exit) {
            System.exit(-1);
        }
    }

    /**
     * Write a debug message to the console and exit.
     * @param message The message to write.
     */
    public static void writeError(vNESCompilerException message, boolean exit) {
        cp.debugPrintln(provider.getError(message));
        if (exit) {
            System.exit(-1);
        }
    }

    /**
     * Write a error message to the console and exit.
     * @param message The message to write.
     */
    public static void writeError(vNESCompilerException message) {
        writeError(message, true);
    }

    public static void writeHeader() {
        cp.println("vNES " + Compiler.VERSION + "(c) 2018 Luc Sieben");
    }

    public static void setProvider(LoggingProvider provider) {
        Logger.provider = provider;
    }
}
