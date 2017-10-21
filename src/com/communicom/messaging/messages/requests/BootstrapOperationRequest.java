package com.communicom.messaging.messages.requests;
import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.utils.MessageNumber;

public class BootstrapOperationRequest extends Message {
	private String version;

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public BootstrapOperationRequest() {
		super();
		this.messageNumber = MessageNumber.BootstrapOperationRequest;
	}
}
