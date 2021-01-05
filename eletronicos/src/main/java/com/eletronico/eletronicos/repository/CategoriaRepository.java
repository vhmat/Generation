package com.eletronico.eletronicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.eletronico.eletronicos.model.CategoriaEletro;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEletro, Long>{
	
}
