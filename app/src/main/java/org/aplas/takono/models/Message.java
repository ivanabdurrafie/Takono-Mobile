package org.aplas.takono.models;

public class Message {
    private String message;
    private Value[] value;

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public Value[] getValue() {
        return value;
    }

    public void setValue(Value[] value) {
        this.value = value;
    }
}

