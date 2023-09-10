package com.example.springSecurity.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springSecurity.data.entity.User;
import com.example.springSecurity.data.util.MyUserDetails;
import com.example.springSecurity.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
		Optional<User> user = userRepo.findByUsername(username);
		if(user.isEmpty()) {
			throw new UsernameNotFoundException("user with '"+username+"' username not found!");
		}
		return user.map(MyUserDetails::new).get();
	}

}
