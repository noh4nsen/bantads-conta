package com.bantads.conta.bantadsconta.model.CUD;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;
import java.util.Date;

import com.bantads.conta.bantadsconta.DTOs.ContaDTO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "conta")
public class ContaC implements Serializable {
    private UUID id;
    private UUID idCliente;
    private UUID idGerente;
    private int numeroConta;
    private BigDecimal saldo;
    private Date dataCriacao;
    private BigDecimal limite;

    public ContaC() {
        super();
    }

    public ContaC(UUID id, UUID idExternoCliente, UUID idExternoGerente, int numeroConta, BigDecimal saldo,
            Timestamp dataCriacao, BigDecimal limite) {
        super();
        this.id = id;
        this.idCliente = idExternoCliente;
        this.idGerente = idExternoGerente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
        this.limite = limite;
    }
    
    public ContaC(ContaDTO conta) {
        super();
        this.id = UUID.randomUUID();
        this.idGerente = conta.getIdGerente();
        this.idCliente = conta.getIdCliente();
        this.dataCriacao =  (Date) Calendar.getInstance().getTime();
        this.saldo = new BigDecimal("0");
        
        if(Integer.parseInt(conta.getSalario().toString()) > 2000) {
        	this.limite = conta.getSalario().divide(new BigDecimal("2"));
        };
    }

    @Id
    @Column(name = "id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Column(name = "idcliente")
    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }

    @Column(name = "idgerente")
    public UUID getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(UUID idGerente) {
        this.idGerente = idGerente;
    }

    @Column(name = "numero")
    public int getNumero() {
        return numeroConta;
    }

    public void setNumero(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Column(name = "saldo")
    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Column(name = "datacriacao")
    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Column(name = "limite")
    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

}
