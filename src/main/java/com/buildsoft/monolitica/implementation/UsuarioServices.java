package com.buildsoft.monolitica.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.buildsoft.monolitica.dao.IUsuarioDao;
import com.buildsoft.monolitica.entity.Usuario;
import com.buildsoft.monolitica.services.IUsuarioServices;


@Service
public class UsuarioServices implements IUsuarioServices{

	@Autowired
	private IUsuarioDao usuarioDao;
	
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
		System.out.println(usuario.getTipoDocumento());
		return usuarioDao.save(usuario);
	}



}
