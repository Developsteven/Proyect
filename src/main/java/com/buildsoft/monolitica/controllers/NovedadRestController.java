package com.buildsoft.monolitica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.buildsoft.monolitica.entity.Novedad;
import com.buildsoft.monolitica.services.IUsuarioServices;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class NovedadRestController {

	
	@Autowired
	private IUsuarioServices usuarioServices;
	
	
	@GetMapping("/novedades/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Novedad verNovedad(Long id) {
		return usuarioServices.findByIdNovedad(id);
	}
	
	@PostMapping("/novedades")
	@ResponseStatus(HttpStatus.CREATED)
	public Novedad crearNovedad(Novedad novedad) {
		return usuarioServices.createNovedad(novedad);
	}
}
