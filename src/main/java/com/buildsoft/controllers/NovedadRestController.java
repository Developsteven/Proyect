package com.buildsoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.buildsoft.entity.Novedad;
import com.buildsoft.entity.TipoNovedad;
import com.buildsoft.services.IAprendizServices;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class NovedadRestController {

	
	@Autowired
	private IAprendizServices usuarioServices;
	

	@GetMapping("/novedades/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Novedad verNovedad(@PathVariable Long id) {
		return usuarioServices.findByIdNovedad(id);
	}
	

	@PostMapping("/novedades")
	@ResponseStatus( HttpStatus.CREATED)
	public Novedad crearNovedad(@RequestBody Novedad novedad) {
		return usuarioServices.createNovedad(novedad);
	}
	

	@GetMapping("/novedades/tipoNovedad")
	@ResponseStatus(HttpStatus.OK)
	public List<TipoNovedad> listarTipoNovedad() {
		return usuarioServices.findAllTipoNovedad();
	}
}
