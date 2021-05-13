package com.buildsoft.services;

import com.buildsoft.security.entity.Usuario;

public interface IUserService {
	
	public Usuario findByEmail(String email);
}
