package com.eletronico.eletronicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eletronico.eletronicos.controller.CategoriaController;

@Repository
public interface ProdutoRepository extends JpaRepository<CategoriaController, Long>{
	
}
