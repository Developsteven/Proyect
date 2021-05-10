package com.buildsoft.monolitica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buildsoft.monolitica.entity.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Long>{

//	@Query("select c from Usuario c where c.mail like %?1")
	public Usuario findByMail(String mail);
}
