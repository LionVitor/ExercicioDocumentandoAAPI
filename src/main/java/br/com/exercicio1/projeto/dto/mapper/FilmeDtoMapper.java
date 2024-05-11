package br.com.exercicio1.projeto.dto.mapper;

import br.com.exercicio1.projeto.dto.FilmeDto;
import br.com.exercicio1.projeto.entity.FilmeEntity;

public class FilmeDtoMapper {

	public static FilmeEntity toEntity(FilmeDto filmeDto) {
		
		FilmeEntity filme = new FilmeEntity();
		filme.setTitulo(filmeDto.getTitulo());
		filme.setDisponivel(filmeDto.isDisponivel());
		filme.setFormatoMidia(filmeDto.getFormatoMidia());
		filme.setGenero(filmeDto.getGenero());
		
		
		return filme;
	}
	
	public static FilmeDto toDto(FilmeEntity filmeEntity) {
		
		FilmeDto filme = new FilmeDto();
		filme.setTitulo(filmeEntity.getTitulo());
		filme.setDisponivel(filmeEntity.isDisponivel());
		filme.setFormatoMidia(filmeEntity.getFormatoMidia());
		filme.setGenero(filmeEntity.getGenero());
		
		
		return filme;
	}
	
}
