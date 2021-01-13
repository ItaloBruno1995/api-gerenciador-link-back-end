package com.example.link.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.link.models.link;

public interface LinkRepository extends JpaRepository<link, Integer> {

	//RETONAR TODOS OS LINKS POR PASTA 
	@Query(value = "SELECT * FROM  tb_link where tb_pasta_idpasta = :ID_PASTA ", nativeQuery = true)
	List<link> listadeLinksPorPasta(@Param("ID_PASTA") int ID_PASTA);
	
	//**
	public List<link> findTop5ByOrderById();
	
	
	
	
}
