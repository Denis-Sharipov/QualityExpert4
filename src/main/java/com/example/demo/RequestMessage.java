package com.example.demo;

public class RequestMessage {
    private final Integer messageId;
    private final String messageFrom;
    private final String messageTo;
    private final String messageBody;

    public RequestMessage(int messageId, String messageFrom, String messageTo, String messageBody) {
        this.messageId = messageId;
        this.messageFrom = messageFrom;
        this.messageTo = messageTo;
        this.messageBody = messageBody;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public String getMessageFrom() {
        return messageFrom;
    }

    public String getMessageTo() {
        return messageTo;
    }

    public String toString(){
        return this.messageFrom + "\nКому" + this.messageTo + "\nТело сообщения: " + this.messageBody;
    }
}

