package com.buildsoft.monolitica.services;

import com.buildsoft.monolitica.entity.Usuario;

public interface IUserService {
	public Usuario findByMail(String mail);
}
