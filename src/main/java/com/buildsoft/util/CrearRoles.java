package com.buildsoft.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.buildsoft.security.entity.Rol;
import com.buildsoft.security.enums.RolNombre;
import com.buildsoft.security.service.RolService;

@Component
public class CrearRoles implements CommandLineRunner{

	
	@Autowired
    RolService rolService;
	
	@Override
	public void run(String... args) throws Exception {
//		Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
//        Rol rolUser = new Rol(RolNombre.ROLE_USER);
//        rolService.save(rolAdmin);
//        rolService.save(rolUser);
//		
	}

}
