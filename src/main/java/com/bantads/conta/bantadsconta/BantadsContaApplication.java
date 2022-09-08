package com.bantads.conta.bantadsconta;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class BantadsContaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BantadsContaApplication.class, args);
	}

}
