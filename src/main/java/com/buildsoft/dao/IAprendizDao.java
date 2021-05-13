package com.buildsoft.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.buildsoft.entity.Aprendiz;


public interface IAprendizDao extends JpaRepository<Aprendiz, Long>{
	
	@Query("select c from Aprendiz c where c.documento like %?1")
	public Aprendiz findByDocumento(String term);
}
