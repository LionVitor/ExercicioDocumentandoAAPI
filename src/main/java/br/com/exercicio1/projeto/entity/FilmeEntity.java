package br.com.exercicio1.projeto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "filme")
public class FilmeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private	String titulo;
	@Column (name = "formato_midia")
	private	String formatoMidia;
	@Column
	private String genero;
	@Column
	private boolean disponivel;

	public FilmeEntity() {
		
	}
	
	public FilmeEntity(Integer id, String titulo, String formatoMidia, String genero, boolean disponivel) {
		this.id = id;
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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