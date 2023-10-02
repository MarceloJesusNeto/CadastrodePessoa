package com.Marcelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Marcelo.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	

}
