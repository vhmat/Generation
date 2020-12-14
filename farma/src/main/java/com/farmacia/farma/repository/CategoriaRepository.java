package com.farmacia.farma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.farmacia.farma.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
}
