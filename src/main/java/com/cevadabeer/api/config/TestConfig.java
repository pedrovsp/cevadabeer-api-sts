package com.cevadabeer.api.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cevadabeer.api.entities.Cerveja;
import com.cevadabeer.api.entities.Cervejaria;
import com.cevadabeer.api.entities.Producao;
import com.cevadabeer.api.entities.User;
import com.cevadabeer.api.entities.enums.Conplexidade;
import com.cevadabeer.api.entities.enums.Cor;
import com.cevadabeer.api.repositories.CervejaRepository;
import com.cevadabeer.api.repositories.CervejariaRepository;
import com.cevadabeer.api.repositories.ProducaoRepository;
import com.cevadabeer.api.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CervejariaRepository cervejariaRepository;

	@Autowired
	private CervejaRepository cervejaRepository;
	
	private ProducaoRepository producaoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", null);
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", null);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		Cervejaria c1 = new Cervejaria(null,"Alienada","avenida","Pinho","386","Uberlandia","MG",u1);
		Cervejaria c2 = new Cervejaria(null,"Uberbrau","avenida","Rosa","555","Uberlandia","MG",u2);
		
		cervejariaRepository.saveAll(Arrays.asList(c1, c2));
		
		Cerveja cj1 = new Cerveja(null,Cor.AMARELA,5.0,"IPA","Rota",40,15,Conplexidade.HARD,c1);
		Cerveja cj2 = new Cerveja(null,Cor.VERMELHA,6.0,"Saison","Filha da Fruta",40,15,Conplexidade.MEDIUM,c1);

		cervejaRepository.saveAll(Arrays.asList(cj1, cj2));
		
		Producao p1 = new Producao(null,30,Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),cj1);
		Producao p2 = new Producao(null,40,Instant.parse("2019-06-20T19:53:07Z"),Instant.parse("2019-06-20T19:53:07Z"),cj2);
		
//		producaoRepository.saveAll(Arrays.asList(p1, p2));
	}
	
}
