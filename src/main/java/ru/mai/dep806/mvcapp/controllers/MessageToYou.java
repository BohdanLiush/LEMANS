package ru.mai.dep806.mvcapp.controllers;

public class MessageToYou {
    private String message;
    private String messageToYou;

    public String getMessage() {
        return "this is simple message: " + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageToYou() {
        return "And this message is for you jack: " + messageToYou;
    }

    public void setMessageToYou(String messageToYou) {
        this.messageToYou = messageToYou;
    }
}
