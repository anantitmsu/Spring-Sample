package com.message;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Domain - Message
 * 
 * @author Anant Goswami
 *
 */
public class Message {

	private String body, from, to;

	private LocalDateTime created;

	public Message(String body, String from, String to, LocalDateTime created) {
		super();
		this.body = body;
		this.from = from;
		this.to = to;
		this.created = created;
	}

	@Override
	public String toString() {
		return String.format("From : %s, To : %s, Body : %s, created : %s", from, to, body,
				created.format(DateTimeFormatter.ofPattern("d-MM-uuuu HH:mm:ss")));
	}
}
