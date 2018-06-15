package com.lsieben.vnes.logger;

import com.lsieben.vnes.lang.exceptions.vNESCompilerException;
import com.lsieben.vnes.lang.exceptions.vNESWarning;

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
    public String getWarning(vNESWarning warning) {
        return warning.toMessage().toXmlString();
    }

    @Override
    public String getError(String error) {
        Message message = new Message(error);
        message.setSeverity("error");
        return message.toXmlString();
    }

    @Override
    public String getError(vNESCompilerException error) {
        return error.toMessage().toXmlString();
    }
}
