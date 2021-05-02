package com.buildsoft.monolitica.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buildsoft.monolitica.dao.IAprendizDao;
import com.buildsoft.monolitica.dao.IFichaDao;
import com.buildsoft.monolitica.dao.IRolDao;
import com.buildsoft.monolitica.dao.ITipoDocumentoDao;
import com.buildsoft.monolitica.dao.ITrimestreDao;
import com.buildsoft.monolitica.dao.IUsuarioDao;
import com.buildsoft.monolitica.entity.Aprendiz;
import com.buildsoft.monolitica.entity.Ficha;
import com.buildsoft.monolitica.entity.Rol;
import com.buildsoft.monolitica.entity.TipoDocumento;
import com.buildsoft.monolitica.entity.Trimestre;
import com.buildsoft.monolitica.entity.Usuario;
import com.buildsoft.monolitica.services.IUsuarioServices;


@Service
public class UsuarioServices implements IUsuarioServices{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Autowired
	private IAprendizDao aprendizDao;
	
	@Autowired
	private IRolDao rolDao;
	
	@Autowired
	private ITipoDocumentoDao documentoDao;
	
	@Autowired
	private IFichaDao fichaDao;
	
	@Autowired
	private ITrimestreDao trimestreDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public Usuario create(Usuario usuario) {
		return usuarioDao.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Rol> findAllRol() {
		return (List<Rol>) rolDao.findAll();
	}
	

	@Override
	@Transactional(readOnly = true)
	public List<Aprendiz> findAllAprendiz() {
		return (List<Aprendiz>) aprendizDao.findAll();
	}

	@Override
	@Transactional(readOnly = false)
	public Aprendiz createAprendiz(Aprendiz aprendiz) {
		return aprendizDao.save(aprendiz);
	}

	@Override
	@Transactional(readOnly = true)
	public Aprendiz findByIdAprendiz(Long id) {
		return aprendizDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TipoDocumento> findAllDocumento() {
		return (List<TipoDocumento>) documentoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Usuario> findAll(Pageable pageable) {
		return usuarioDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Aprendiz> findAllAprendiz(Pageable pageable) {
		return aprendizDao.findAll(pageable);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Trimestre> findAllTrimestres() {
		return (List<Trimestre>) trimestreDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Ficha> findAllFichas() {
		return (List<Ficha>) fichaDao.findAll();
	}



}
