package com.communicom.messaging.messages.requests;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.utils.MessageNumber;

public class PingServerRequest extends Message {
	public PingServerRequest(){
		super();
		this.messageName = "Ping Server Request";
		this.messageNumber = MessageNumber.PingServerRequest;
	}
}
