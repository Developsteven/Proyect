package com.buildsoft.monolitica.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "fichas")
public class Ficha implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ficha", nullable = false)
	private Long id;
	
	@NotEmpty
	@Column( nullable = false)
	private String nombre;
	
	@NotEmpty
	@Column( nullable = false, unique = true)
	private String siglas;
	
	@NotEmpty
	@Column(name = "numero_ficha", nullable = false, unique = true)
	private String numero;
	
//	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//	@JoinTable(name="fichas_trimestres", joinColumns = @JoinColumn(name="ficha_id"),
//	inverseJoinColumns = @JoinColumn(name="trimestre_id"),
//	uniqueConstraints = {@UniqueConstraint(columnNames = {"ficha_id","trimestre_id"})})
//	private List<Trimestre> trimestres;
	

	public Ficha() {
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}
	

//	public List<Trimestre> getTrimestres() {
//		return trimestres;
//	}
//
//	public void setTrimestres(List<Trimestre> trimestres) {
//		this.trimestres = trimestres;
//	}


	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


	@Override
	public String toString() {
		return "Ficha [id=" + id + ", nombre=" + nombre + ", siglas=" + siglas + ", numero=" + numero + "]";
	}


	private static final long serialVersionUID = 1L;

}
