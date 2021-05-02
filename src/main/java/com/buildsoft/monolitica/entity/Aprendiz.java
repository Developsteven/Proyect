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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name = "aprendices")
public class Aprendiz implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aprendiz", nullable = false)
	private Long id;
	
	@NotEmpty
	@Column( nullable = false)
	private String documento;
	
	@NotEmpty
	@Column( nullable = false)
	private String nombre;
	
	@NotEmpty
	@Column( nullable = false)
	private String apellido;
	
	@NotEmpty
	@Email
	@Column( nullable = false, unique = true)
	private String mail;
	
	@Column( nullable = false)
	private String telefono;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_tipoDocumento_fk", nullable = false)
	private TipoDocumento tipoDocumento;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ficha_fk")
	private Ficha ficha;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_trimestre_fk")
	private Trimestre trimestre;
	
	
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

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	public Trimestre getTrimestre() {
		return trimestre;
	}

	public void setTrimestre(Trimestre trimestre) {
		this.trimestre = trimestre;
	}

	@Override
	public String toString() {
		return "Aprendiz [id=" + id + ", documento=" + documento + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", mail=" + mail + ", telefono=" + telefono + ", tipoDocumento=" + tipoDocumento + ", ficha=" + ficha
				+ ", trimestre=" + trimestre + "]";
	}


	private static final long serialVersionUID = 1L;

}
