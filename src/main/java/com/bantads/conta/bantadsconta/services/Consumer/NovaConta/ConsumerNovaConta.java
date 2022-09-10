package com.bantads.conta.bantadsconta.services.Consumer.NovaConta;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.bantads.conta.bantadsconta.DTOs.NovaContaDTO;
import com.bantads.conta.bantadsconta.data.CUD.ContaCRepository;
import com.bantads.conta.bantadsconta.data.R.ContaRRepository;
import com.bantads.conta.bantadsconta.model.CUD.ContaC;
import com.bantads.conta.bantadsconta.model.R.ContaR;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ConsumerNovaConta {
    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private ContaCRepository contaCRepository;

    @Autowired
    private ContaRRepository contaRRepository;

    @RabbitListener(queues = "nova-conta")
    public void receive(@Payload String json) {
        try {
            NovaContaDTO novaContaDTO = objectMapper.readValue(json, NovaContaDTO.class);
            ContaC contaC = novaContaC(novaContaDTO);
            ContaR contaR = mapper.map(contaC, ContaR.class);
            contaCRepository.save(contaC);
            contaRRepository.save(contaR);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private ContaC novaContaC(NovaContaDTO novaContaDTO){
        ContaC conta = new ContaC();
        conta.setId(UUID.randomUUID());
        conta.setIdCliente(novaContaDTO.getIdExternoCliente());
        conta.setIdGerente(novaContaDTO.getIdExternoGerente());
        conta.setSaldo(new BigDecimal(0.0));
        conta.setLimite(getLimite(novaContaDTO.getSalario()));
        conta.setDataCriacao((Date) Calendar.getInstance().getTime());
        conta.setNumero(contaCRepository.maxNumero() + 1);
        return conta;
    }

    private BigDecimal getLimite(BigDecimal salario) {
        BigDecimal limite = new BigDecimal(0.0);
        BigDecimal divisor = new BigDecimal(2);
        if (salario.compareTo(new BigDecimal(2000.00)) >= 0)
            limite = salario.divide(divisor, 2, RoundingMode.FLOOR);
        return limite;
    }
}
