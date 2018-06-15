package com.lsieben.vnes.lang.exceptions;

import com.lsieben.vnes.logger.Message;

public class vNESWarning {
    private int code = -1;
    private String message = "Unknown warning";

    public vNESWarning(String... arguments) {
        for(int i = 1; i < arguments.length + 1; i++) {
            message = message.replace("$" + String.valueOf(i), arguments[i]);
        }
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
