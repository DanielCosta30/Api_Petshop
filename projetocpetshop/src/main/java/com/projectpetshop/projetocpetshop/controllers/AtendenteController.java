package com.projectpetshop.projetocpetshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectpetshop.projetocpetshop.entities.Atendente;
import com.projectpetshop.projetocpetshop.repositories.AtendenteRepository;

@RestController
@RequestMapping(value = "/api")
public class AtendenteController {

	@Autowired
	private AtendenteRepository repository;

	@GetMapping("/atendentes")
	public List<Atendente> findAll2() {
		List<Atendente> result = repository.findAll();
		return result;
	}

	@PostMapping("/atendentes")
	public Atendente insert(@RequestBody Atendente user){
		Atendente result = repository.save(user);
		return result;	
	}	
		
	@DeleteMapping("/atendentes")
	public void deleteAtendetes(@RequestBody Atendente atendente) {
		repository.delete(atendente);

	}

	@PutMapping("/atendentes")
		public Atendente atualizaAtendente(@RequestBody Atendente atendente){
		return repository.save(atendente);	
	}
}
