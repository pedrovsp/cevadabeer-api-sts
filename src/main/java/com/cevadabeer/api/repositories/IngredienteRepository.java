package com.cevadabeer.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cevadabeer.api.entities.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long>{
	
}
