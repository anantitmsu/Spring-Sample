package com.message;

import java.util.ArrayList;
import java.util.List;

public class MessageServiceImpl implements MessageService {

	private List<Message> message = new ArrayList<Message>();

	public void setMessage(List<Message> message) {

		this.message = message;

	}

	public void printMessage() {

		message.forEach(System.out::println);

	}

}
