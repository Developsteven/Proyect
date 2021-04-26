package com.buildsoft.monolitica.services;

import java.util.List;

import com.buildsoft.monolitica.entity.Rol;
import com.buildsoft.monolitica.entity.Usuario;


public interface IUsuarioServices {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario create(Usuario usuario);
	
	public List<Rol> findAllRol();
}
