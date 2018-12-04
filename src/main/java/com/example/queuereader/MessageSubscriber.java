package com.example.queuereader;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.SubscribableChannel;

import javax.annotation.Resource;

@Resource(name = "abc")
@MessageEndpoint
public class MessageSubscriber  implements MessageHandler {


    MessageSubscriber (SubscribableChannel channel) {
        channel.subscribe(this);
    }

    @ServiceActivator(inputChannel = "myMessageChannel")
    @Override
    public void handleMessage(Message m) {
        System.out.println("payload" + m.getPayload());
    }

}
