package com.bantads.conta.bantadsconta.DTOs;

import java.util.List;

import com.bantads.conta.bantadsconta.model.R.GerenteConta;

public class Top5GerenteResponseDTO {

	private List<GerenteConta> gerentesContas;
	
	public Top5GerenteResponseDTO(List<GerenteConta> lista) {
		this.gerentesContas = lista;
	}
	
	public List<GerenteConta> getGerentesContas(){
		return this.gerentesContas;
	}
	
	public void setGerentesContas(List<GerenteConta> gerentesContas) {
		this.gerentesContas = gerentesContas;
	}
}
