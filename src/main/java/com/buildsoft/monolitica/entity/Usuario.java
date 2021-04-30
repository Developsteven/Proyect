package com.buildsoft.monolitica.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Long id;
	
	@NotEmpty
	@Column(nullable = false)
	private String nombre;
	
	@NotEmpty
	@Column(nullable = false)
	private String apellido;
	
	@NotEmpty
	@Email
	@Column( nullable = false, unique = true)
	private String mail;
	
	@NotEmpty
	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private boolean estado;
	
	@OneToOne
	@JoinColumn(name = "id_rol_fk", nullable = false)
	private Rol rol;
	


	public Usuario() {

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


	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	public Rol getRol() {
		return rol;
	}


	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", estado="
				+ estado + ", rol=" + rol + "]";
	}



	private static final long serialVersionUID = 1L;
	
}
