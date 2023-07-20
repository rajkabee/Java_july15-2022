package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposirory extends JpaRepository<User, Integer> {
	
	Optional<User> findByUsername(String username);
	
}
