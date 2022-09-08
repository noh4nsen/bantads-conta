package com.bantads.conta.bantadsconta;

import org.modelmapper.ModelMapper;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableRabbit
@SpringBootApplication
public class BantadsContaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BantadsContaApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
