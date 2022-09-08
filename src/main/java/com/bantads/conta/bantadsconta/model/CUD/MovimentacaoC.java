package com.bantads.conta.bantadsconta.model.CUD;

import java.util.UUID;

import java.io.Serializable;
import java.math.BigDecimal;

import com.bantads.conta.bantadsconta.model.TipoMovimentacao;

public class Movimentacao implements Serializable {
    private UUID id;
    private ContaC contaOrigem;
    private ContaC contaDestino;
    private BigDecimal valorMovimentacao;
    private BigDecimal saldo;
    private TipoMovimentacao tipoMovimentacao;

    public Movimentacao() {
        super();
    }

    public Movimentacao(UUID id, ContaC contaOrigem, ContaC contaDestino, BigDecimal valorMovimentacao, BigDecimal saldo,
            TipoMovimentacao tipoMovimentacao) {
        super();
        this.id = id;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valorMovimentacao = valorMovimentacao;
        this.saldo = saldo;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ContaC getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(ContaC contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public ContaC getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(ContaC contaDestino) {
        this.contaDestino = contaDestino;
    }

    public BigDecimal getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(BigDecimal valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

}
