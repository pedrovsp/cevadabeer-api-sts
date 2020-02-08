package com.cevadabeer.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cevadabeer.api.entities.Producao;

public interface ProducaoRepository extends JpaRepository<Producao, Long>{
	
}
