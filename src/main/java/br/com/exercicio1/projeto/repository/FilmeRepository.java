package br.com.exercicio1.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exercicio1.projeto.entity.FilmeEntity;

public interface FilmeRepository extends JpaRepository<FilmeEntity, Integer> {
	
}
