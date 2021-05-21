package com.buildsoft.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buildsoft.security.entity.Usuario;
import com.buildsoft.security.repository.UsuarioRepository;


@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	
	@GetMapping("/usuario")
	public List<Usuario> index() {
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuario/page/{page}")
	public Page<Usuario> index(@PathVariable Integer page) {
		return usuarioRepository.findAll(PageRequest.of(page, 4));
	}
	
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<?> findByid(@PathVariable Long id) {
		
		Optional<Usuario> usuario = null;
		Map<String, Object> response = new HashMap<>();

		try {

			usuario = usuarioRepository.findById(id);

		} catch (DataAccessException e) {
			response.put("mensaje", "Error al realizar la consulta en la base de datos");
			response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (usuario == null) {
			response.put("mensaje", "El usuario ID: ".concat(id.toString().concat(" no existe en la base de datos!")));
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Usuario>(HttpStatus.OK);
	}
	
	
	
}
