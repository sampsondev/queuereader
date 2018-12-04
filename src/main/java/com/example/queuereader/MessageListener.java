package com.example.queuereader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

@Service
public class MessageListener {

    @Autowired
    SubscribableChannel myMessageChannel;

//    @Resource
//    MessageHandler theHandler;




    @JmsListener(destination = "datatrans")
    public void readMessage(String json) throws Exception {
//        throw  new Exception("message was in error");
        MessageClass myMessage = MessageClass.fromJSON(json);
        System.out.println("the message was  " + myMessage.getTheMessage());
        Message<String> message = MessageBuilder.withPayload("outta here").build();
        System.out.print("sending message");
//        myMessageChannel.subscribe(theHandler);
        myMessageChannel.send(message);
    }


    @JmsListener(destination = "topicQueue")
    public void readMessageFromTopic(String json) throws IOException {
        System.out.println("to string " + json);
    }
}
