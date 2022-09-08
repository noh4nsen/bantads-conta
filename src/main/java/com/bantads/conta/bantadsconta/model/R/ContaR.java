package com.bantads.conta.bantadsconta.model.R;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "conta")
public class ContaR implements Serializable {
    private UUID id;
    private UUID idExternoCliente;
    private UUID idExternoGerente;
    private long numeroConta;
    private BigDecimal saldo;
    private Timestamp dataCriacao;
    private BigDecimal limite;

    public ContaR() {
        super();
    }

    public ContaR(UUID id, UUID idExternoCliente, UUID idExternoGerente, long numeroConta, BigDecimal saldo,
            Timestamp dataCriacao, BigDecimal limite) {
        super();
        this.id = id;
        this.idExternoCliente = idExternoCliente;
        this.idExternoGerente = idExternoGerente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
        this.limite = limite;
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

    @Column(name = "numeroconta")
    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
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
    public Timestamp getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Timestamp dataCriacao) {
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
