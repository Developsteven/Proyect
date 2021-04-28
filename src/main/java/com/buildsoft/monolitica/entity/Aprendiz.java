package com.buildsoft.monolitica.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "aprendices")
public class Aprendiz implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aprendiz", nullable = false)
	private Long id;
	
	@Column( nullable = false)
	private String documento;
	
	@Column( nullable = false)
	private String nombre;
	
	@Column( nullable = false)
	private String apellido;
	
	@Column( nullable = false, unique = true)
	private String mail;
	
	@Column( nullable = false)
	private String telefono;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tipoDocumento_fk", nullable = false)
	private TipoDocumento tipoDocumento;
	
	public Aprendiz() {
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	@Override
	public String toString() {
		return "Aprendiz [id=" + id + ", documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", mail=" + mail + ", telefono=" + telefono + "]";
	}

	private static final long serialVersionUID = 1L;

}
