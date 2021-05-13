package com.buildsoft.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buildsoft.dao.IAprendizDao;
import com.buildsoft.dao.IFichaDao;
import com.buildsoft.dao.INovedadDao;
import com.buildsoft.dao.ITipoDocumentoDao;
import com.buildsoft.dao.ITipoNovedadDao;
import com.buildsoft.dao.ITrimestreDao;
import com.buildsoft.entity.Aprendiz;
import com.buildsoft.entity.Ficha;
import com.buildsoft.entity.Novedad;
import com.buildsoft.entity.TipoDocumento;
import com.buildsoft.entity.TipoNovedad;
import com.buildsoft.entity.Trimestre;
import com.buildsoft.security.entity.Usuario;
import com.buildsoft.security.repository.UsuarioRepository;
import com.buildsoft.services.IUsuarioServices;


@Service
public class AprendizServices implements IUsuarioServices{

	@Autowired
	private UsuarioRepository usuarioDao;
	
	@Autowired
	private IAprendizDao aprendizDao;
	
	
	@Autowired
	private ITipoDocumentoDao documentoDao;
	
	@Autowired
	private IFichaDao fichaDao;
	
	@Autowired
	private ITrimestreDao trimestreDao;
	
	@Autowired
	private INovedadDao novedadDao;
	
	@Autowired
	private ITipoNovedadDao tipoNovedadDao;
	
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

	@Override
	@Transactional(readOnly = true)
	public Novedad findByIdNovedad(Long id) {
		return novedadDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public Novedad createNovedad(Novedad novedad) {
		return novedadDao.save(novedad);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TipoNovedad> findAllTipoNovedad() {
		return (List<TipoNovedad>) tipoNovedadDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Aprendiz findByDocumento(String term) {
		return aprendizDao.findByDocumento(term);
	}



}
