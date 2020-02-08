package com.cevadabeer.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cevadabeer.api.entities.Producao;
import com.cevadabeer.api.services.ProducaoService;

@RestController
@RequestMapping(value = "/producao")
public class ProducaoResources {
	
	@Autowired
	private ProducaoService service;
	
	@GetMapping
	public ResponseEntity<List<Producao>> findAll(){
		List<Producao> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Producao> findById(@PathVariable Long id){
		Producao obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
