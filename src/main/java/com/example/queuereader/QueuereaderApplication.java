package com.example.queuereader;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.DeleteMessageRequest;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.ReceiveMessageRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class QueuereaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(QueuereaderApplication.class, args);
//        final AmazonSQS sqs = AmazonSQSClientBuilder.standard().withRegion("us-east-1").build();
		// Receive messages
//		System.out.println("Receiving messages from MyQueue.\n");
//		final ReceiveMessageRequest receiveMessageRequest = new ReceiveMessageRequest("https://sqs.us-east-1.amazonaws.com/203743034184/datatrans");
//		final List<Message> messages = sqs.receiveMessage(receiveMessageRequest).getMessages();
//		for (final Message message : messages) {
//			System.out.println("Message");
//			System.out.println("  MessageId:     " + message.getMessageId());
//			System.out.println("  ReceiptHandle: " + message.getReceiptHandle());
//			System.out.println("  MD5OfBody:     " + message.getMD5OfBody());
//			System.out.println("  Body:          " + message.getBody());
//			for (final Map.Entry<String, String> entry : message.getAttributes().entrySet()) {
//				System.out.println("Attribute");
//				System.out.println("  Name:  " + entry.getKey());
//				System.out.println("  Value: " + entry.getValue());
//			}
//		}
//		System.out.println();
//		String messageReceiptHandle = messages.get(0).getReceiptHandle();
//		sqs.deleteMessage(new DeleteMessageRequest("https://sqs.us-east-1.amazonaws.com/203743034184/datatrans", messageReceiptHandle ));

	}
}
