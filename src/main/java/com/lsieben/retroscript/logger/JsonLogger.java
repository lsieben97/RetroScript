package com.lsieben.retroscript.logger;

import com.google.gson.Gson;
import com.lsieben.retroscript.lang.exceptions.vNESCompilerException;
import com.lsieben.retroscript.lang.exceptions.vNESWarning;

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
    public String getWarning(vNESWarning warning) {
        return new Gson().toJson(warning.toMessage());
    }

    @Override
    public String getError(String error) {
        Message message = new Message(error);
        message.setSeverity("error");;
        return new Gson().toJson(message);
    }

    @Override
    public String getError(vNESCompilerException error) {
        return new Gson().toJson(error.toMessage());
    }
}
