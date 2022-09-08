package com.bantads.conta.bantadsconta.DTOs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


public class ContaResponseDTO implements Serializable {
	
private UUID id;
	
    private UUID idCliente;

    private UUID idGerente;
	
    private long numero;

    private BigDecimal saldo;

    private Date dataCriacao;

    private BigDecimal limite;

    public ContaResponseDTO() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idExternoCliente) {
        this.idCliente = idExternoCliente;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numeroConta) {
        this.numero = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public UUID getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(UUID idExternoGerente) {
        this.idGerente = idExternoGerente;
    }
}
