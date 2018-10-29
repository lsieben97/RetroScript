package com.lsieben.retroscript.logger;

import com.google.gson.Gson;
import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptWarning;

public class JsonLogger implements LoggingProvider {

    @Override
    public String getInfo(String info) {
        return new Gson().toJson(new Message(info));
    }

    @Override
    public String getDebug(String debug) {
        return new Gson().toJson(new Message(debug));
    }

    @Override
    public String getWarning(String warning) {
        Message message = new Message(warning);
        message.setSeverity("warning");;
        return new Gson().toJson(message);
    }

    @Override
    public String getWarning(RetroScriptWarning warning) {
        return new Gson().toJson(warning.toMessage());
    }

    @Override
    public String getError(String error) {
        Message message = new Message(error);
        message.setSeverity("error");;
        return new Gson().toJson(message);
    }

    @Override
    public String getError(RetroScriptCompilerException error) {
        return new Gson().toJson(error.toMessage());
    }
}
