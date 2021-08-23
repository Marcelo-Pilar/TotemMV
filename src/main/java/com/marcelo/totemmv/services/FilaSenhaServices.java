package com.marcelo.totemmv.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.totemmv.domain.FilaSenha;
import com.marcelo.totemmv.domain.RegistroTotem;
import com.marcelo.totemmv.repositories.FilaSenhaRepository;
import com.marcelo.totemmv.repositories.RegistroTotemRepository;

@Service
public class FilaSenhaServices {
	
	@Autowired
	FilaSenhaRepository repository;
	RegistroTotemRepository repoTotem;
	
//	public FilaSenha salvar(FilaSenha filaSenha) {
//		Optional<RegistroTotem> result = repoTotem.findById(filaSenha.getIdRegistroTotem());
//		RegistroTotem resultList = result.get();
//		
//		if(result.isPresent()) {
//			VerificaValor(filaSenha.getIdRegistroTotem(), resultList);
//			return repository.save(filaSenha);
//		}
//		
//		return null;
//	}
	
	public void VerificaValor(Long id, RegistroTotem resultList) {
		List<FilaSenha> filaSenha = repository.findByIdFilaSenhaIdRegistroTotem(id);
		
		if(!filaSenha.isEmpty()) {
//			resultList.setFilaSenha(filaSenha);
			repoTotem.save(resultList);
		}
	}

}
