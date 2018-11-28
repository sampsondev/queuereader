package com.example.queuereader;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@MessageEndpoint
public class MessageSubscriber {

    @ServiceActivator(inputChannel = "myMessageChannel")
    void handleMessage(Message m) {
        System.out.println("payload" + m.getPayload());
    }

}
