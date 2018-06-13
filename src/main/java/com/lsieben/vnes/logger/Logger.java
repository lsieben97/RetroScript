package com.lsieben.vnes.logger;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;
import com.lsieben.vnes.Compiler;

/**
 * Logger class to write stuff to the console.
 */
public class Logger {
    /**
     * Colored printer to write with color.
     */
    private static ColoredPrinter cp;

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
        cp.debugPrintln("[DEBUG]\t" + message, 2);
    }

    /**
     * Write a debug message to the console.
     * @param message The message to write.
     */
    public static void writeInfo(String message) {
        cp.debugPrintln("[INFO]\t" + message, 2);
    }

    /**
     * Write a debug message to the console.
     * @param message The message to write.
     */
    public static void writeWarning(String message) {
        cp.debugPrintln("[WARNING]\t" + message, Ansi.Attribute.NONE, Ansi.FColor.YELLOW, Ansi.BColor.BLACK);
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
        cp.debugPrintln("[ERROR]\t" + message, Ansi.Attribute.NONE, Ansi.FColor.RED, Ansi.BColor.BLACK);
        if (exit) {
            System.exit(-1);
        }
    }

    public static void writeHeader() {
        cp.debugPrintln("vNES " + Compiler.VERSION + "(c) 2018 Luc Sieben");
    }

}
