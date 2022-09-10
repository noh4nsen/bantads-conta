package com.bantads.conta.bantadsconta.services.Producer.Rollback.Autenticacao;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderAutenticacaoConfig {
    @Value("rollback-autocadastro-autenticacao")
    private String queueRollbackAutocadastroAutenticacao;

    @Bean
    public Queue queueRollbackAutocadastroAutenticacao() {
        return new Queue(queueRollbackAutocadastroAutenticacao);
    }
}
