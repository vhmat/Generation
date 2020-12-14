package com.eletronico.eletronicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.eletronico.eletronicos.model.TipoEletro;

@Repository
public interface TipoEletroRepository extends JpaRepository<TipoEletro, Long>{
	
}
