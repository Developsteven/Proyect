package com.buildsoft.monolitica.services;

import java.util.List;

import com.buildsoft.monolitica.entity.Aprendiz;
import com.buildsoft.monolitica.entity.Rol;
import com.buildsoft.monolitica.entity.TipoDocumento;
import com.buildsoft.monolitica.entity.Usuario;


public interface IUsuarioServices {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario create(Usuario usuario);
	
	public List<Rol> findAllRol();
	
	public List<Aprendiz> findAllAprendiz();
	
	public Aprendiz findByIdAprendiz(Long id);
	
	public Aprendiz createAprendiz(Aprendiz aprendiz);
	
	public List<TipoDocumento> findAllDocumento();
}
