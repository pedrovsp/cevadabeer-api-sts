package com.cevadabeer.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cevadabeer.api.entities.Ingrediente;
import com.cevadabeer.api.repositories.IngredienteRepository;

@Service
public class IngredienteService {

	@Autowired
	private IngredienteRepository repository;
	
	public List<Ingrediente> findAll(){
		return repository.findAll();
	}
	
	public Ingrediente findById(Long id) {
		Optional<Ingrediente> obj = repository.findById(id);
		return obj.get();
	}
}
