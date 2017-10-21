package com.communicom.messaging.messages;

import java.time.LocalDateTime;
import com.communicom.messaging.messages.utils.MessageNumber;

public class Message {
	protected String messageName;
	protected MessageNumber messageNumber;
	protected String sourceAddress;
	protected String targetAddress;
	protected LocalDateTime emissionTime;

	public String getName() {
		return messageName;
	}

	public void setName(String messageName) {
		this.messageName = messageName;
	}

	public MessageNumber getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(MessageNumber messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getSourceAddress() {
		return sourceAddress;
	}

	public void setSourceAddress(String sourceAddress) {
		this.sourceAddress = sourceAddress;
	}

	public String getTargetAddress() {
		return targetAddress;
	}

	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}

	public LocalDateTime getEmisionTime() {
		return emissionTime;
	}

	public void setEmisionTime(LocalDateTime emisionTime) {
		this.emissionTime = emisionTime;
	}

	public Message() {
		this.emissionTime = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "messageName=" + messageName 
				+ ", messageNumber=" + (messageNumber.ordinal() + 1) 
				+ ", emissionTime=" + emissionTime;
	}
}
