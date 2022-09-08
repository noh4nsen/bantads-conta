package com.bantads.conta.bantadsconta.DTOs;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;


public class ContaResponseDTO implements Serializable {
	
	private UUID id;
	private UUID idCliente;
	private UUID idGerente;
	private int numeroConta;
	private BigDecimal saldo;
	private Date dataCriacao;
	private BigDecimal limite;
	
	public ContaResponseDTO() {
	    super();
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
	
	public void setIdCliente(UUID idCliente) {
	    this.idCliente = idCliente;
	}
	
	public UUID getIdGerente() {
	    return idGerente;
	}
	
	public void setIdGerente(UUID idGerente) {
	    this.idGerente = idGerente;
	}
	
	public int getNumero() {
	    return numeroConta;
	}
	
	public void setNumero(int numeroConta) {
	    this.numeroConta = numeroConta;
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
}
