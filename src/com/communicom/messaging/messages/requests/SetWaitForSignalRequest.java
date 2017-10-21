package com.communicom.messaging.messages.requests;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.signals.SignalType;
import com.communicom.messaging.messages.utils.MessageNumber;

public class SetWaitForSignalRequest extends Message {
	private SignalType signal;
	private String signalValue;
	
	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}
	
	public SetWaitForSignalRequest(){
		super();
		this.messageName = "Set Wait For Signal Request";
		this.messageNumber = MessageNumber.SetWaitForSignalRequest;
	}
}
