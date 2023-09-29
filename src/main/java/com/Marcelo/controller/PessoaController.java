package com.Marcelo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Marcelo.model.Pessoa;
import com.Marcelo.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
	public List<Pessoa> listarPessoas(){
		
		List<Pessoa> pessoas = pessoaRepository.findAll();
		
		return pessoas;
	
	}
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> findById(@PathVariable Long id){
		return pessoaRepository.findById(id).map(gravado -> ResponseEntity.ok().body(gravado)).orElse(ResponseEntity.notFound().build());
	}	
}
	
