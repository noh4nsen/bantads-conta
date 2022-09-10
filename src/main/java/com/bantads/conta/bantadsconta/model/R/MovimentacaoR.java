package com.bantads.conta.bantadsconta.model.R;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "movimentacao")
public class MovimentacaoR implements Serializable {
    private UUID id;
    private BigDecimal valor;
    private UUID origem;
    private UUID destino;
    private int tipoMovimentacao;
    private UUID saga;
    private Date dataHora;

    public MovimentacaoR() {
        super();
    }

    public MovimentacaoR(UUID id, UUID contaOrigem, UUID contaDestino, BigDecimal valorMovimentacao, BigDecimal saldo,
    		int tipoMovimentacao, UUID saga) {
        super();
        this.id = id;
        this.origem = contaOrigem;
        this.destino = contaDestino;
        this.valor = valorMovimentacao;
        this.saga = saga;
        this.tipoMovimentacao = tipoMovimentacao;
    }

    @Id
    @Column(name = "id")
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Column(name = "origem")
    public UUID getOrigem() {
        return origem;
    }

    public void setOrigem(UUID contaOrigem) {
        this.origem = contaOrigem;
    }
    
    @Column(name = "destino")
    public UUID getDestino() {
        return destino;
    }

    public void setDestino(UUID contaDestino) {
        this.destino = contaDestino;
    }

    @Column(name = "valor")
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valorMovimentacao) {
        this.valor = valorMovimentacao;
    }

    @Column(name = "tipomovimentacao")
    public int getTipoMovimentacao() {
        return this.tipoMovimentacao;
    }

    public void setTipoMovimentacao(int tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }
    
    @Column(name="saga")
    public UUID getSaga() {
    	return this.saga;
    }
    
    public void setSaga(UUID saga) {
    	this.saga = saga;
    }
    
    @Column(name="datahora")
    public Date getDataHora() {
    	return this.dataHora;
    }
    
    public void setDataHora(Date dataHora) {
    	this.dataHora = dataHora;
    }
}
