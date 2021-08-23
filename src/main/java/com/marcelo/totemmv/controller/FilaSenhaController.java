package com.marcelo.totemmv.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.marcelo.totemmv.domain.FilaSenha;
import com.marcelo.totemmv.services.FilaSenhaServices;

import lombok.AllArgsConstructor;
//AJEITAR OS CAMPOS(INCONCLUÍDOS)
@AllArgsConstructor
@RestController
@RequestMapping("/filaSenha")
public class FilaSenhaController {
	
//	private FilaSenhaRepository filaSenhaRepository;
	private FilaSenhaServices filaSenhaServices;

//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public FilaSenha adicionar(@Valid @RequestBody FilaSenha filaSenha) {
//		return filaSenhaServices.salvar(filaSenha);
//	}
	
	
	
//	@GetMapping
//	public String listar() {
//		return "TESTE";
//	}
//
//	@GetMapping("/{filaSenhaId}")
//	public ResponseEntity<FilaSenha> buscar(@PathVariable Long filaSenhaId) {
//		return filaSenhaRepository.findById(filaSenhaId).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//	}

//	@PostMapping
//	@ResponseStatus(HttpStatus.CREATED)
//	public FilaSenha adicionar(@Valid @RequestBody FilaSenha filaSenha) {
//		return filaSenhaServices.salvar(filaSenha);
//	}
//
//	@PutMapping("/{filaSenhaId}")
//	public ResponseEntity<FilaSenha> atualizar(@PathVariable Long filaSenhaId, @Valid @RequestBody FilaSenha filaSenha) {
//		if (!filaSenhaRepository.existsById(filaSenhaId)) {
//			return ResponseEntity.notFound().build();
//		}
//
//		filaSenha.setId(filaSenhaId);
//		filaSenha = filaSenhaServices.salvar(filaSenha);
//
//		return ResponseEntity.ok(filaSenha);
//	}
//
//	@DeleteMapping("/{filaSenhaId}")
//
//	public ResponseEntity<Void> remover(@PathVariable Long clienteId) {
//		if (!filaSenha.existsById(filaSenhaId)) {
//			return ResponseEntity.notFound().build();
//		}
//
//		filaSenhaServices.excluir(filaSenhaId);
//
//		return ResponseEntity.noContent().build();
//	}

}
