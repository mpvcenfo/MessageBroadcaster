package com.communicom.messaging.messages.responses;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.utils.MessageNumber;

public class PingServerResponse extends Message {
	public PingServerResponse(){
		super();
		this.messageName = "Ping Server Response";
		this.messageNumber = MessageNumber.PingServerResponse;
	}
}
