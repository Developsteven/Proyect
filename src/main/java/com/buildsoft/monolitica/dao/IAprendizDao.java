package com.buildsoft.monolitica.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.buildsoft.monolitica.entity.Aprendiz;


public interface IAprendizDao extends JpaRepository<Aprendiz, Long>{
	
}
