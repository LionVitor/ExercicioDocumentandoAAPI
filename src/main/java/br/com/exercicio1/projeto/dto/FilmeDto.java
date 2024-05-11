package br.com.exercicio1.projeto.dto;


public class FilmeDto {

	private	String titulo;
	private	String formatoMidia;
	private String genero;
	private boolean disponivel;

	public FilmeDto() {
		
	}
	
	public FilmeDto(String titulo, String formatoMidia, String genero, boolean disponivel) {
		this.titulo = titulo;
		this.formatoMidia = formatoMidia;
		this.genero = genero;
		this.disponivel = disponivel;
	}

	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFormatoMidia() {
		return formatoMidia;
	}

	public void setFormatoMidia(String formatoMidia) {
		this.formatoMidia = formatoMidia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
}
