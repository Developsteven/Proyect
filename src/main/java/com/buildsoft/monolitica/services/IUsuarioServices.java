package com.buildsoft.monolitica.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.buildsoft.monolitica.entity.Aprendiz;
import com.buildsoft.monolitica.entity.Ficha;
import com.buildsoft.monolitica.entity.Rol;
import com.buildsoft.monolitica.entity.TipoDocumento;
import com.buildsoft.monolitica.entity.Trimestre;
import com.buildsoft.monolitica.entity.Usuario;


public interface IUsuarioServices {
	
	public List<Usuario> findAll();
	
	public Page<Usuario> findAll(Pageable pageable);
	
	public Usuario findById(Long id);
	
	public Usuario create(Usuario usuario);
	
	public List<Rol> findAllRol();
	
	public List<Aprendiz> findAllAprendiz();
	
	public Page<Aprendiz> findAllAprendiz(Pageable pageable);
	
	public Aprendiz findByIdAprendiz(Long id);
	
	public Aprendiz createAprendiz(Aprendiz aprendiz);
	
	public List<TipoDocumento> findAllDocumento();
	
	public List<Trimestre> findAllTrimestres();
	
	public List<Ficha> findAllFichas();
}
