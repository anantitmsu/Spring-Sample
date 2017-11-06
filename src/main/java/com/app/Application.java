package com.app;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.message.Message;
import com.message.MessageService;
import com.message.MessageServiceImpl;

/**
 * Example of Spring Dependency Injection along with Java 8 SDK
 * 
 * @author Anant Goswami
 */
public class Application {

	@Bean
	MessageService getMessageService() {
		return new MessageServiceImpl();
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		MessageService messageService = context.getBean(MessageServiceImpl.class);

		List<Message> message = Arrays.asList(new Message("Good Morning", "Hasnen", "Anant", LocalDateTime.now()),
				new Message("Very Good Morning", "Anant", "Hasnen", LocalDateTime.now()),
				new Message("Good Afternoon", "Harsh", "Anant", LocalDateTime.now()),
				new Message("Have a Lunch", "Anant", "Harsh", LocalDateTime.now()),
				new Message("Good Evening", "Harsh", "Anant", LocalDateTime.now()),
				new Message("Have a sport", "Anant", "Harsh", LocalDateTime.now()),
				new Message("Good Night", "Raj", "Anant", LocalDateTime.now()),
				new Message("Good Dreams. Take Care.", "Anant", "Raj", LocalDateTime.now()));

		messageService.setMessage(message);
		messageService.printMessage();
	}

}
