package com.escola.secretaria.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.escola.secretaria.model.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{
	public List<Turma> findAllByTurmaContainingIgnoreCase(String turma);
}
