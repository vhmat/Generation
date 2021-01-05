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

import com.eletronico.eletronicos.model.Produto;
import com.eletronico.eletronicos.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produto> get(@PathVariable long id){
		return repository.findById(id).map(answer -> ResponseEntity.ok(answer)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<Produto> inserirObjeto(@RequestBody Produto creatingData){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(creatingData));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto updatingData){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(updatingData));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
}
