package com.example.demo.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		Optional<User> user = userRepository.findByUsername(username);
		System.out.println(user.get());
		if(user.get()==null) {
			throw new  UsernameNotFoundException("User not found!");
		}
		return new MyUserDetails(user.get());
	}

	public void addUsers() {
		userRepository.save(new User("user", "password", "ROLE_USER", true));
		userRepository.save(new User("admin", "password", "ROLE_USER,ROLE_ADMIN", true));
	}

}
