package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping
public class MessageController {
    HashMap<Integer, String> messagesMap = new HashMap<>();
    @PutMapping("/ok")
    public ResponseMessage putMessage(@RequestBody RequestMessage requestMessage){
        ResponseMessage responseMessage = new ResponseMessage(requestMessage.getMessageId(), requestMessage.getMessageFrom(), requestMessage.getMessageTo(), "Lorem ipsum.");
        messagesMap.put(responseMessage.getMessageId(), responseMessage.toString());
        return responseMessage;
    }

    @PostMapping("/ok")
    public ResponseMessage postMessage(@RequestBody RequestMessage requestMessage){
        ResponseMessage responseMessage = new ResponseMessage(requestMessage.getMessageId(), requestMessage.getMessageFrom(), requestMessage.getMessageTo(), requestMessage.getMessageBody());
        messagesMap.put(responseMessage.getMessageId(), responseMessage.toString());
        return responseMessage;
    }

    @GetMapping("/ok")
    public String ok(@RequestBody RequestMessage requestMessage) {
        return messagesMap.toString();
    }
}
