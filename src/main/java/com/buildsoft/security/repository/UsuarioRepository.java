package com.buildsoft.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.buildsoft.security.entity.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByNombreUsuario(String nombreUsuario);
	
    boolean existsByNombreUsuario(String nombreUsuario);
    
    boolean existsByEmail(String email);
    
//	@Query("select c from Usuario c where c.mail like %?1")
	public Usuario findByEmail(String email);
}
