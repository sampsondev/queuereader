package com.example.queuereader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MessageListener {

    @Autowired
    MessageChannel myMessageChannel;

    @JmsListener(destination = "datatrans")
    public void readMessage(String json) throws IOException {
        MessageClass myMessage = MessageClass.fromJSON(json);
        System.out.println("the message was  " + myMessage.getTheMessage());
        Message<String> message = MessageBuilder.withPayload("outta here").build();
        System.out.print("sending message");
        myMessageChannel.send(message);
    }

}
