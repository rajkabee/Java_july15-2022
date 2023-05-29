package com.springAop;

import org.springframework.stereotype.Component;

@Component
public class Messaging {
	public void taskSendMessage() {
		System.out.println("Message Sending...");
	}
}
