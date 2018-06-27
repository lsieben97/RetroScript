package com.lsieben.retroscript.logger;

import java.time.LocalDateTime;

public class Message {
    private String severity = "info";
    private String timestamp = LocalDateTime.now().toString();
    private String code = "-1";
    private String message;
    private String location;

    public Message(String message) {
        this.message = message;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "vns" + String.valueOf(code) + ": " + message;
    }

    public String toXmlString() {
        String xml = "<Message>";

        xml += "<severity>" + severity + "</severity>";
        xml += "<code>" + code + "</code>";
        xml += "<timestamp>" + timestamp + "</timestamp>";
        xml += "<message>" + message + "</message>";
        xml += "<location>" + location + "</location>";

        xml += "</message>";
        return xml;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
