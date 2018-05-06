package com.lsieben.vnes.compiler;

import com.lsieben.vnes.logger.Logger;
import org.apache.commons.cli.*;

import java.util.Arrays;

public class Compiler {
    public static final String VERSION = "v1.0.0";
    private String[] commandLineArgs;

    public Compiler(String[] commandLineArgs) {
        this.commandLineArgs = commandLineArgs;


    }



    public void start() {
        Logger.start(2);
        Logger.writeHeader();
    }

}
