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

import com.projectpetshop.projetocpetshop.entities.Produto;
import com.projectpetshop.projetocpetshop.repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping("/produtos")
	public List<Produto> findAll(){
		List<Produto> result = repository.findAll();
		return result;
	}	
	
	@PostMapping("/produtos")
	public Produto insert(@RequestBody Produto user){
		Produto result = repository.save(user);
		return result;		
	}	
	
	@DeleteMapping("/produtos")
	public void deleteProduto(@RequestBody Produto produto) {
		repository.delete(produto);

	}

	@PutMapping("/produtos")
		public Produto atualizaProduto(@RequestBody Produto produto){
		return repository.save(produto);		
	}	
}
