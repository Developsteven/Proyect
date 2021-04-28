package com.buildsoft.monolitica.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buildsoft.monolitica.dao.IRolDao;
import com.buildsoft.monolitica.dao.IUsuarioDao;
import com.buildsoft.monolitica.entity.Rol;
import com.buildsoft.monolitica.entity.Usuario;
import com.buildsoft.monolitica.services.IUsuarioServices;


@Service
public class UsuarioServices implements IUsuarioServices{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Autowired
	private IRolDao rolDao;
	
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



}
