package com.eletronico.eletronicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eletronico.eletronicos.model.TipoEletro;
import com.eletronico.eletronicos.repository.TipoEletroRepository;

@RestController
@RequestMapping("/TipoEletro")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class TipoEletroController {
	@Autowired
	private TipoEletroRepository repository;
	
	@GetMapping
	public ResponseEntity<List<TipoEletro>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TipoEletro> getID(@PathVariable long id){
		return repository.findById(id).map(answer -> ResponseEntity.ok(answer)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<TipoEletro> post(@RequestBody TipoEletro creatingData){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(creatingData));
	}
	
	//Retornando pacote htttps do TipoEletro. Recebendo algo pela body -> um objeto do TipoEletro. 
	//Retornar com status ok 
	
	
	@PutMapping
	public ResponseEntity<TipoEletro> put(@RequestBody TipoEletro  updatingData){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(updatingData));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
