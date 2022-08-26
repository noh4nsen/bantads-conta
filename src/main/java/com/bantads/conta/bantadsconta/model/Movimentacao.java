package com.bantads.conta.bantadsconta.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Movimentacao implements Serializable {
    private int id;
    private Conta contaOrigem;
    private Conta contaDestino;
    private BigDecimal valorMovimentacao;
    private BigDecimal saldo;
    private TipoMovimentacao tipoMovimentacao;

    public Movimentacao() {
        super();
    }

    public Movimentacao(int id, Conta contaOrigem, Conta contaDestino, BigDecimal valorMovimentacao, BigDecimal saldo,
            TipoMovimentacao tipoMovimentacao) {
        super();
        this.id = id;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valorMovimentacao = valorMovimentacao;
        this.saldo = saldo;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
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
