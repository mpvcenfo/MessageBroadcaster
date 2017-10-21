package com.communicom.messaging.messages.responses;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.signals.SignalType;
import com.communicom.messaging.messages.utils.MessageNumber;

public class SetWaitForSignalResponse extends Message {
	private SignalType signal;
	private String signalExpectedValue;
	private String signalReceivedValue;

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalExpectedValue() {
		return signalExpectedValue;
	}

	public void signalExpectedValue(String signalExpectedValue) {
		this.signalExpectedValue = signalExpectedValue;
	}

	public String getSignalReceivedValue() {
		return signalReceivedValue;
	}

	public void setSignalReceivedValue(String signalReceivedValue) {
		this.signalReceivedValue = signalReceivedValue;
	}
	
	public SetWaitForSignalResponse(){
		super();
		this.messageName = "Set Wait For Signal Response";
		this.messageNumber = MessageNumber.SetWaitForSignalResponse;
	}
}
