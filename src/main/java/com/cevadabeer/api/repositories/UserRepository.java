package com.cevadabeer.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cevadabeer.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
