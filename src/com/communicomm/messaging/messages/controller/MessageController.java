package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.factory.MessageFactory;
import com.communicom.messaging.messages.utils.MessageNumber;

public class MessageController {
	private ArrayList<Message> messages = new ArrayList<Message>();
	
	public void sendMessage(MessageNumber messageOption) {
		messages.add(MessageFactory.createMessage(messageOption));
	}

	public void listMessage(MessageNumber messageOption) {
		for(Message currentMessage: messages) {
			currentMessage.toString();
			if(currentMessage.getMessageNumber() == messageOption) {
				
			}
		}
	}
}