package com.lsieben.vnes.logger;

import com.lsieben.vnes.lang.exceptions.vNESCompilerException;
import com.lsieben.vnes.lang.exceptions.vNESWarning;

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
    public String getWarning(vNESWarning warning) {
        return getDateTime() + "\t[WARNING]\t\t" + warning.toString();
    }

    @Override
    public String getError(String error) {
        return getDateTime() + "\t[ERROR]\t\t" + error;
    }

    @Override
    public String getError(vNESCompilerException error) {
        return getDateTime() + "\t[ERROR]\t\t" + error.toString();
    }
    private String getDateTime() {
        return LocalDateTime.now().toString();
    }
}
