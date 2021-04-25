package com.buildsoft.monolitica.dao;

import org.springframework.data.repository.CrudRepository;

import com.buildsoft.monolitica.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
