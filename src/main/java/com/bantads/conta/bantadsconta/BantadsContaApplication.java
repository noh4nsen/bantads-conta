package com.bantads.conta.bantadsconta;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bantads.conta.bantadsconta.services.Producer.Rollback.Autenticacao.SenderAutenticacao;
import com.bantads.conta.bantadsconta.services.Producer.Rollback.Gerente.SenderGerente;

@EnableRabbit
@SpringBootApplication
public class BantadsContaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BantadsContaApplication.class, args);
	}

	@Bean
	public SenderGerente senderG() {
		return new SenderGerente();
	}

	@Bean
	public SenderAutenticacao senderA() {
		return new SenderAutenticacao();
	}
}
