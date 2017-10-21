package com.communicom.messaging.messages.responses;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.utils.MessageNumber;
import com.communicom.messaging.messages.utils.ResultType;

public class BootstrapOperationResponse extends Message {
	private String version;
	private ResultType result;
	private String errorMessage;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public ResultType getResult() {
		return result;
	}
	public void setResult(ResultType result) {
		this.result = result;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public BootstrapOperationResponse() {
		super();
		this.messageName = "Bootstrap Operation Response";
		this.messageNumber = MessageNumber.BootstrapOperationResponse;
	}
}
