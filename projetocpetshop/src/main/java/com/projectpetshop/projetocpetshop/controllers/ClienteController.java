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

import com.projectpetshop.projetocpetshop.entities.Cliente;
import com.projectpetshop.projetocpetshop.repositories.ClienteRepository;

@RestController
@RequestMapping(value = "/api")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	
	@GetMapping("/clientes")
	public List<Cliente> findAll(){
		List<Cliente> result = repository.findAll();
		return result;
		
	}
	@PostMapping("/clientes")
	public Cliente insert(@RequestBody Cliente user){
		Cliente result = repository.save(user);
		return result;
	
	}	
	
	@DeleteMapping("/clientes")
	public void deleteCliente(@RequestBody Cliente cliente) {
		repository.delete(cliente);

	}

	@PutMapping("/clientes")
		public Cliente atualizaCliente(@RequestBody Cliente cliente){
		return repository.save(cliente);		
	}
}
