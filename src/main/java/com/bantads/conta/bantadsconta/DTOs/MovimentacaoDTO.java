package com.bantads.conta.bantadsconta.DTOs;

import java.math.BigDecimal;
import java.util.UUID;

public class MovimentacaoDTO {

	private UUID id;
	private BigDecimal valor;
	private int tipoMovimentacao;
	private UUID origem;
	private UUID destino;
	
	public MovimentacaoDTO() {
		
	}
	
	public UUID getId() {
		return this.id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public BigDecimal getValor() {
		return this.valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public int getTipoMovimentacao() {
		return this.tipoMovimentacao;
	}
	
	public void setTipoMovimentacao(int tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	
	public UUID getOrigem() {
		return this.origem;
	}
	
	public void setOrigem(UUID origem) {
		this.origem = origem;
	}
	
	public UUID getDestino() {
		return this.destino;
	}
	
	public void setDestino(UUID destino) {
		this.destino = destino;
	}
}
