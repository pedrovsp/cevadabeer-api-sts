package com.cevadabeer.api.config;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cevadabeer.api.entities.Cervejaria;
import com.cevadabeer.api.entities.User;
import com.cevadabeer.api.repositories.CervejariaRepository;
import com.cevadabeer.api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CervejariaRepository cervejariaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", null);
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", null);
		
		Cervejaria c1 = new Cervejaria(null,"Alienada","avenida","Pinho","386","Uberlandia","MG",u1);
		Cervejaria c2 = new Cervejaria(null,"Uberbrau","avenida","Rosa","555","Uberlandia","MG",u2);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		cervejariaRepository.saveAll(Arrays.asList(c1, c2));
	}
	
	
}
