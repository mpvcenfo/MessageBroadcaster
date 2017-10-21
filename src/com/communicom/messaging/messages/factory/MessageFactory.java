package com.communicom.messaging.messages.factory;

import com.communicom.messaging.messages.Message;
import com.communicom.messaging.messages.requests.BootstrapOperationRequest;
import com.communicom.messaging.messages.requests.PingServerRequest;
import com.communicom.messaging.messages.requests.SetWaitForSignalRequest;
import com.communicom.messaging.messages.responses.BootstrapOperationResponse;
import com.communicom.messaging.messages.responses.PingServerResponse;
import com.communicom.messaging.messages.responses.SetWaitForSignalResponse;
import com.communicom.messaging.messages.utils.MessageNumber;

public final class MessageFactory {
	public static Message createMessage(MessageNumber pNumber) {
		switch (pNumber) {
		case PingServerRequest:
			return new PingServerRequest();
		case PingServerResponse:
			return new PingServerResponse();
		case SetWaitForSignalRequest:
			return new SetWaitForSignalRequest();
		case SetWaitForSignalResponse:
			return new SetWaitForSignalResponse();
		case BootstrapOperationRequest:
			return new BootstrapOperationRequest();
		case BootstrapOperationResponse:
			return new BootstrapOperationResponse();
		}
		return null;
	}
}
