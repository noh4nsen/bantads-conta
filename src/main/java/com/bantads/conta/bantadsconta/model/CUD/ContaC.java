package com.bantads.conta.bantadsconta.model.CUD;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;
import java.util.Date;

import com.bantads.conta.bantadsconta.DTOs.ContaDTO;
import com.rabbitmq.client.AMQP.Basic.Return;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "conta")
public class ContaC implements Serializable {
    private UUID id;
    private UUID idExternoCliente;
    private UUID idExternoGerente;
    private int numero;
    private BigDecimal saldo;
    private Date dataCriacao;
    private BigDecimal limite;
    private UUID saga;

    public ContaC() {
        super();
    }

    public ContaC(UUID id, UUID idExternoCliente, UUID idExternoGerente, int numeroConta, BigDecimal saldo,
            Timestamp dataCriacao, BigDecimal limite, UUID saga) {
        super();
        this.id = id;
        this.idExternoCliente = idExternoCliente;
        this.idExternoGerente = idExternoGerente;
        this.numero = numeroConta;
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
        this.limite = limite;
        this.saga = saga;
    }
    
    public ContaC(ContaDTO conta) {
        super();
        this.id = UUID.randomUUID();
        this.idExternoGerente = conta.getIdGerente();
        this.idExternoCliente = conta.getIdCliente();
        this.saga = conta.getSaga();
        this.dataCriacao =  (Date) Calendar.getInstance().getTime();
        this.saldo = new BigDecimal("0");
        this.limite = new BigDecimal("0");
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

    @Column(name = "idexternocliente")
    public UUID getIdExternoCliente() {
        return idExternoCliente;
    }

    public void setIdExternoCliente(UUID idExternoCliente) {
        this.idExternoCliente = idExternoCliente;
    }

    @Column(name = "idexternogerente")
    public UUID getIdExternoGerente() {
        return idExternoGerente;
    }

    public void setIdExternoGerente(UUID idExternoGerente) {
        this.idExternoGerente = idExternoGerente;
    }

    @Column(name = "numero")
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
    
    @Column(name="saga")
    public UUID getSaga() {
    	return saga;
    }
    
    public void setSaga(UUID saga) {
    	this.saga = saga;
    }
}
