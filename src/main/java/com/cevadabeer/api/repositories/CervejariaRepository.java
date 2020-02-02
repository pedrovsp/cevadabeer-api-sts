package com.cevadabeer.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cevadabeer.api.entities.Cervejaria;

public interface CervejariaRepository extends JpaRepository<Cervejaria, Long>{
	
}
