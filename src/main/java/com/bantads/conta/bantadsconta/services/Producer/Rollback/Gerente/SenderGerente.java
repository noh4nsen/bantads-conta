package com.bantads.conta.bantadsconta.services.Producer.Rollback.Gerente;

import java.util.UUID;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class SenderGerente {
    @Autowired
    public RabbitTemplate template;

    @Autowired
    private Queue queueRollbackAutocadastroGerente;

    @Autowired
    private ObjectMapper objectMapper;

    public void send(UUID saga) throws JsonProcessingException {
        String json = objectMapper.writeValueAsString(saga);
        this.template.convertAndSend(this.queueRollbackAutocadastroGerente.getName(), json);
    }
}
