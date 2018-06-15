package com.lsieben.vnes.lang.exceptions;

import com.lsieben.vnes.logger.Message;

public class vNESWarning {
    private String code;
    private String message;

    public vNESWarning(String... arguments) {
        message = getMessage();
        code = getCode();
        for(int i = 1; i < arguments.length + 1; i++) {
            message = message.replace("$" + String.valueOf(i), arguments[i]);
        }
    }

    public String getMessage() {
        return "Unknown error";
    }

    public String getCode() {
        return "-1";
    }

    public Message toMessage() {
        Message msg = new Message(message);
        msg.setSeverity("warning");
        msg.setCode(code);
        return msg;
    }

    @Override
    public String toString() {
        return "vns" + String.valueOf(code) + ": " + message;
    }
}
