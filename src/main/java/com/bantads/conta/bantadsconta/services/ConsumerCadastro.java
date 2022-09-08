package com.bantads.conta.bantadsconta.services;

import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.bantads.conta.bantadsconta.DTOs.GerenteContaDTO;
import com.bantads.conta.bantadsconta.data.R.GerenteContaRepository;
import com.bantads.conta.bantadsconta.model.R.GerenteConta;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ConsumerCadastro {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private GerenteContaRepository gerenteContaRepository;

    @RabbitListener(queues = "autocadastro-gerente-conta")
    public void receive(@Payload String json) {
        try {
            GerenteContaDTO gerenteContaDTO = objectMapper.readValue(json, GerenteContaDTO.class);
            GerenteConta gerenteConta = new GerenteConta(
                    UUID.randomUUID(),
                    gerenteContaDTO.getId(),
                    0,
                    BigDecimal.ZERO,
                    BigDecimal.ZERO,
                    gerenteContaDTO.getSaga());
            gerenteContaRepository.save(gerenteConta);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
