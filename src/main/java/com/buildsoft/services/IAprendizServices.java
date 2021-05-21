package com.buildsoft.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.buildsoft.entity.Aprendiz;
import com.buildsoft.entity.Ficha;
import com.buildsoft.entity.Novedad;
import com.buildsoft.entity.TipoDocumento;
import com.buildsoft.entity.TipoNovedad;
import com.buildsoft.entity.Trimestre;
import com.buildsoft.security.entity.Usuario;


public interface IAprendizServices {
	
	public List<Usuario> findAll();
	
	public Page<Usuario> findAll(Pageable pageable);
	
	public Usuario findById(Long id);
	
	public Usuario create(Usuario usuario);
	
	public List<Aprendiz> findAllAprendiz();
	
	public Page<Aprendiz> findAllAprendiz(Pageable pageable);
	
	public Aprendiz findByIdAprendiz(Long id);
	
	public Aprendiz createAprendiz(Aprendiz aprendiz);
	
	public List<TipoDocumento> findAllDocumento();
	
	public List<Trimestre> findAllTrimestres();
	
	public List<Ficha> findAllFichas();
	
	public Novedad findByIdNovedad(Long id);
	
	public Novedad createNovedad(Novedad novedad);
	
	public List<TipoNovedad> findAllTipoNovedad();
	
	public Aprendiz findByDocumento(String term);
	
	
}
