package com.bantads.conta.bantadsconta.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.security.Timestamp;

public class Conta implements Serializable {
    private int id;
    private int idExternoCliente;
    private int idExternoGerente;
    private long numeroConta;
    private BigDecimal saldo;
    private Timestamp dataCriacao;
    private BigDecimal limite;

    public Conta() {
        super();
    }

    public Conta(int id, int idExternoCliente, int idExternoGerente, long numeroConta, BigDecimal saldo,
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdExternoCliente() {
        return idExternoCliente;
    }

    public void setIdExternoCliente(int idExternoCliente) {
        this.idExternoCliente = idExternoCliente;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Timestamp getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Timestamp dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public int getIdExternoGerente() {
        return idExternoGerente;
    }

    public void setIdExternoGerente(int idExternoGerente) {
        this.idExternoGerente = idExternoGerente;
    }

}
