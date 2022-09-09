package com.bantads.conta.bantadsconta.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.bantads.conta.bantadsconta.DTOs.ContaDTO;
import com.bantads.conta.bantadsconta.DTOs.ContaResponseDTO;
import com.bantads.conta.bantadsconta.data.R.ContaRRepository;
import com.bantads.conta.bantadsconta.data.R.GerenteContaRepository;
import com.bantads.conta.bantadsconta.model.R.ContaR;
import com.bantads.conta.bantadsconta.services.SenderTeste;

import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin
@RestController
@RequestMapping("contas")
public class ContaController {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private SenderTeste senderTeste;

	@Autowired
	private ContaRRepository contaRRepository;

	@GetMapping("/health")
	public String health() {
		return "ʕ·͡ᴥ·ʔ";
	}

	@PostMapping("/teste-inserir")
	public ResponseEntity<ContaResponseDTO> testaFilaInserir(@RequestBody ContaDTO conta) {
		try {
			senderTeste.sendInserir(conta);
			return ResponseEntity.ok().body(null);
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/obter-idcliente/{idCliente}")
	public ResponseEntity<ContaResponseDTO> obterPorIdCliente(@PathVariable UUID idCliente) {
		try {
			ContaR conta = contaRRepository.findByIdCliente(idCliente);

			if (conta != null) {
				ContaResponseDTO response = mapper.map(conta, ContaResponseDTO.class);
				return ResponseEntity.ok().body(response);
			} else {
				return ResponseEntity.ok().body(null);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}

	@GetMapping("/obter/{id}")
	public ResponseEntity<ContaResponseDTO> obterPorId(@PathVariable UUID id) {
		try {
			Optional<ContaR> contaOpt = contaRRepository.findById(id);

			ContaR conta = contaOpt.get();

			if (conta != null) {
				ContaResponseDTO response = mapper.map(conta, ContaResponseDTO.class);
				return ResponseEntity.ok().body(response);
			} else {
				return ResponseEntity.ok().body(null);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			return ResponseEntity.status(500).build();
		}
	}
}
