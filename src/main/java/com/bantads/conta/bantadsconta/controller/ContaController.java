package com.bantads.conta.bantadsconta.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bantads.conta.bantadsconta.DTOs.ContaDTO;
import com.bantads.conta.bantadsconta.DTOs.ContaResponseDTO;
import com.bantads.conta.bantadsconta.model.R.ContaR;
import com.bantads.conta.bantadsconta.services.SenderConta;
import com.bantads.conta.bantadsconta.services.SenderTeste;

import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin
@RestController
@RequestMapping("contas")
public class ContaController {
	
	@Autowired
    private SenderTeste senderTeste;
	
    @GetMapping("/health")
    public String health() {
        return "ʕ·͡ᴥ·ʔ";
    }
    
    @PostMapping("/teste-inserir")
    public ResponseEntity<ContaResponseDTO> testaFilaInserir(@RequestBody ContaDTO conta){
    	try {
    		senderTeste.sendInserir(conta);
        	return ResponseEntity.ok().body(null);
    	} catch(Exception ex) {
    		ex.printStackTrace();
    		return ResponseEntity.status(500).build();
    	}
    }
}
