package com.example.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	public Optional<User> findByUsername(String Username);
}
