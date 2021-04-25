package com.buildsoft.monolitica.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Rol implements Serializable{



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rol", nullable = false)
	private int id;
	
	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
	
	@Column(name = "estado", nullable = false)
	private boolean estado;

	public Rol() {

	}
	
	public int getId() {
		return id;
	}

	public void setId(int idRol) {
		this.id = idRol;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Rol [id=" + id + ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}

	private static final long serialVersionUID = 1L;
}
