package com.projectpetshop.projetocpetshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectpetshop.projetocpetshop.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
