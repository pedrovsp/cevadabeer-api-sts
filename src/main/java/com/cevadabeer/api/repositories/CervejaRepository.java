package com.cevadabeer.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cevadabeer.api.entities.Cerveja;

public interface CervejaRepository extends JpaRepository<Cerveja, Long>{
	
}
