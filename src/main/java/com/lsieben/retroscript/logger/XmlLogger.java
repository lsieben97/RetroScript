package com.lsieben.retroscript.logger;

import com.lsieben.retroscript.lang.exceptions.RetroScriptCompilerException;
import com.lsieben.retroscript.lang.exceptions.RetroScriptWarning;

public class XmlLogger implements LoggingProvider {
    @Override
    public String getInfo(String info) {
        return new Message(info).toXmlString();
    }

    @Override
    public String getDebug(String debug) {
        return new Message(debug).toXmlString();
    }

    @Override
    public String getWarning(String warning) {
        Message message = new Message(warning);
        message.setSeverity("warning");;
        return message.toXmlString();
    }

    @Override
    public String getWarning(RetroScriptWarning warning) {
        return warning.toMessage().toXmlString();
    }

    @Override
    public String getError(String error) {
        Message message = new Message(error);
        message.setSeverity("error");
        return message.toXmlString();
    }

    @Override
    public String getError(RetroScriptCompilerException error) {
        return error.toMessage().toXmlString();
    }
}
