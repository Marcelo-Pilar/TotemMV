package com.marcelo.totemmv.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcelo.totemmv.repositories.FilaSenhaRepository;

@Service
public class FilaSenhaServices {
	
	@Autowired
	FilaSenhaRepository repository;

	
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
	
//	public void VerificaValor(Long id, RegistroTotem resultList) {
//		List<FilaSenha> filaSenha = repository.findByIdFilaSenhaIdRegistroTotem(id);
//		
//		if(!filaSenha.isEmpty()) {
////			resultList.setFilaSenha(filaSenha);
//			repoTotem.save(resultList);
//		}
//	}

}
