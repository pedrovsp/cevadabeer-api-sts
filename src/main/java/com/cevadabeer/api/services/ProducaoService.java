package com.cevadabeer.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cevadabeer.api.entities.Producao;
import com.cevadabeer.api.repositories.ProducaoRepository;

@Service
public class ProducaoService {

	@Autowired
	private ProducaoRepository repository;
	
	public List<Producao> findAll(){
		return repository.findAll();
	}
	
	public Producao findById(Long id) {
		Optional<Producao> obj = repository.findById(id);
		return obj.get();
	}
}
