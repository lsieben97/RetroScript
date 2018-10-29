package com.lsieben.retroscript.logger;

import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptWarning;

import java.time.LocalDateTime;

public class CliLogger implements LoggingProvider {
    @Override
    public String getInfo(String info) {
        return getDateTime() + "\t[INFO]\t\t" + info;
    }

    @Override
    public String getDebug(String debug) {
        return getDateTime() + "\t[DEBUG]\t\t" + debug;
    }

    @Override
    public String getWarning(String warning) {
        return getDateTime() + "\t[WARNING]\t\t" + warning;
    }

    @Override
    public String getWarning(RetroScriptWarning warning) {
        return getDateTime() + "\t[WARNING]\t\t" + warning.toString();
    }

    @Override
    public String getError(String error) {
        return getDateTime() + "\t[ERROR]\t\t" + error;
    }

    @Override
    public String getError(RetroScriptCompilerException error) {
        return getDateTime() + "\t[ERROR]\t\t" + error.toString();
    }
    private String getDateTime() {
        return LocalDateTime.now().toString();
    }
}
