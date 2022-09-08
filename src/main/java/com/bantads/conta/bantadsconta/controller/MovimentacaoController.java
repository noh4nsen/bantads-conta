package com.bantads.conta.bantadsconta.controller;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bantads.conta.bantadsconta.DTOs.MovimentacaoDTO;
import com.bantads.conta.bantadsconta.DTOs.MovimentacaoResponseDTO;
import com.bantads.conta.bantadsconta.data.CUD.MovimentacaoCRepository;
import com.bantads.conta.bantadsconta.data.R.MovimentacaoRRepository;
import com.bantads.conta.bantadsconta.model.CUD.MovimentacaoC;

@CrossOrigin
@RestController
@RequestMapping("movimentacao")
public class MovimentacaoController {

	@Autowired
    private ModelMapper mapper;
	
	@Autowired
    private MovimentacaoRRepository movimentacaoRRepository;

	@Autowired
    private MovimentacaoCRepository movimentacaoCRepository;
	
	@PostMapping("/insere")
	public ResponseEntity<MovimentacaoResponseDTO> insere(@RequestBody MovimentacaoDTO movimentacao) {
		
		//MovimentacaoC movimentacao = new MovimentacaoC(movimentacao);
		
		//INSERE A MOVIMENTACAO
		//ATUALIZA O SALDO DA CONTA
		//MANDA PRA FILA DE DO READ QUE ATUALIZA OS DOIS E O gerenteconta 	
		return ResponseEntity.ok().body(null);
	}
	
	@GetMapping("/obter-data")
	public ResponseEntity<MovimentacaoResponseDTO> obtemPorData(Date data){
		
		//BUSCAR TODAS AS MOVIMENTACOES DESSA DATA AI
		//-ver a questao de retorno com lista
		return ResponseEntity.ok().body(null);
	}
	
	/*@GetMapping("/gerente-conta/")
	public ResponseEntity<Top5GerenteResponseDTO> obtemTop5Gerentes(){
		
		return ResponseEntity.ok().body(null);
	}*/
}
