package br.com.exercicio1.projeto.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exercicio1.projeto.dto.FilmeDto;
import br.com.exercicio1.projeto.entity.FilmeEntity;
import br.com.exercicio1.projeto.repository.FilmeRepository;
import br.com.exercicio1.projeto.dto.mapper.FilmeDtoMapper;

@Service
public class FilmeService {
	@Autowired
	private FilmeRepository repository;
	
	public void cadastrarFilme(FilmeEntity filme) {
		repository.save(filme);
	}
	
	public List<FilmeDto> listarFilmes(){
		return repository.findAll().stream()
				.map(f -> FilmeDtoMapper.toDto(f))
				.collect(Collectors.toList());
	}
	
	public List<FilmeDto> listarFilmePorMidia(String formatoMidia){
		return repository.findAll().stream()
				.filter(t -> t.getFormatoMidia().equals(formatoMidia))
				.map(f -> FilmeDtoMapper.toDto(f))
				.collect(Collectors.toList());
	}
	
	public List<FilmeDto> listarFilmePorTitulo(String titulo){
		return repository.findAll().stream()
				.filter(t -> t.getTitulo().equals(titulo))
				.map(f -> FilmeDtoMapper.toDto(f))
				.collect(Collectors.toList());
	}
	
	
}
