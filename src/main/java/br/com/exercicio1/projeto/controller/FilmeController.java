package br.com.exercicio1.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.exercicio1.projeto.service.FilmeService;
import br.com.exercicio1.projeto.dto.FilmeDto;
import br.com.exercicio1.projeto.dto.mapper.FilmeDtoMapper;
import br.com.exercicio1.projeto.entity.FilmeEntity;


@RestController
@RequestMapping("/filmes")
public class FilmeController {
	
	@Autowired
	private FilmeService filmeService;
	
	@PostMapping("/salvar")
	public ResponseEntity<FilmeDto> salvar(@RequestBody FilmeDto dto){
		filmeService.cadastrarFilme(FilmeDtoMapper.toEntity(dto));
		return ResponseEntity.ok(null);
	}
	
	@GetMapping
	public List<FilmeDto> listarTodos(){
		return filmeService.listarFilmes();
	}

	@GetMapping("/filme/titulo/{titulo}") 
	public List<FilmeDto> listarPorTitulo(@PathVariable String titulo){
		return filmeService.listarFilmePorTitulo(titulo);
		
	}
	
	@GetMapping("/filme/midia/{formatoMidia}")
	public List<FilmeDto> listarPorFormatoMidia(@PathVariable String formatoMidia){
		return filmeService.listarFilmePorMidia(formatoMidia);
		
	}
}
