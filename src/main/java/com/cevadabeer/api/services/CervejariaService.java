package com.cevadabeer.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cevadabeer.api.entities.Cervejaria;
import com.cevadabeer.api.repositories.CervejariaRepository;

@Service
public class CervejariaService {

	@Autowired
	private CervejariaRepository repository;
	
	public List<Cervejaria> findAll(){
		return repository.findAll();
	}
	
	public Cervejaria findById(Long id) {
		Optional<Cervejaria> obj = repository.findById(id);
		return obj.get();
	}
}
