package com.lsieben.retroscript.lang.exceptions;

import com.lsieben.retroscript.logger.Message;

public class RetroScriptCompilerException extends Exception {
    private String code;
    private String message;
    private String location;

    public final String newLine = System.lineSeparator();

    public RetroScriptCompilerException(String location, String... arguments) {
        message = getErrorMessage();
        code = getCode();
        for(int i = 1; i < arguments.length + 1; i++) {
            message = message.replace("$" + String.valueOf(i), arguments[i - 1]);
        }

    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getErrorMessage() {
        return "Unknown error";
    }

    public String getCode() {
        return "-1";
    }


    public Message toMessage() {
        Message msg = new Message(message);
        msg.setSeverity("warning");
        msg.setCode(code);
        msg.setLocation(location);
        return msg;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
