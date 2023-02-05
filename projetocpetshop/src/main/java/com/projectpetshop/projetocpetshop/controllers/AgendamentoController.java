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

import com.projectpetshop.projetocpetshop.entities.Agendamento;
import com.projectpetshop.projetocpetshop.repositories.AgendamentoRepository;

@RestController
@RequestMapping(value = "/api")
public class AgendamentoController {
	
	@Autowired 
	private AgendamentoRepository repository;
	
	@GetMapping("/agendamentos")
	public List<Agendamento> findAl(){
		List<Agendamento> result = repository.findAll();
		return result;
	}
	
	@PostMapping("/agendamentos")
	public Agendamento insert(@RequestBody Agendamento user){
		Agendamento result = repository.save(user);
		return result;	
		
	}
	
	@DeleteMapping("/agendamentos")
	public void deleteAgendamento (@RequestBody Agendamento agendamento) {
		repository.delete(agendamento);
	
    }

	@PutMapping("/agendamentos")
	public Agendamento atualizaAgendamento(@RequestBody Agendamento agendamento){
		return repository.save(agendamento);
	}
}
