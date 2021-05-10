package com.buildsoft.monolitica.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buildsoft.monolitica.dao.IUsuarioDao;
import com.buildsoft.monolitica.entity.Usuario;

@Service
public class UsuarioService implements UserDetailsService, IUserService {
	
	private Logger logger = LoggerFactory.getLogger(UsuarioService.class);

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Usuario usuario = usuarioDao.findByMail(username);
		
		if(usuario == null) {
			logger.error("Error en el login: no existe el usuario '" + username + "' en el sistema!");
			throw new UsernameNotFoundException("Error en el login: no existe el usuario '" + username + "' en el sistema!");
		}
		
		List<GrantedAuthority> authorities = usuario.getRol()
				.stream()
				.map(rol -> new SimpleGrantedAuthority(rol.getNombre()))
				.peek(authority -> logger.info("Rol: " + authority.getAuthority()))
				.collect(Collectors.toList());

		return new User(usuario.getMail(), usuario.getPassword(), usuario.getEstado(), true, true, true, authorities);
	}

	@Override
	@Transactional(readOnly=true)
	public Usuario findByMail(String mail) {
		return usuarioDao.findByMail(mail);
	}

}
