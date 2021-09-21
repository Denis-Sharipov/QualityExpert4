package com.example.demo;

public class ResponseMessage {
    private final Integer messageId;
    private final String messageFrom;
    private final String messageTo;
    private final String messageBody;

    public ResponseMessage(int messageId, String messageFrom, String messageTo, String messageBody) {
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
        return "\nОт кого: " + this.messageFrom + "\nКому: " + this.messageTo + "\nТело сообщения: " + this.messageBody + "\n";
    }

}
