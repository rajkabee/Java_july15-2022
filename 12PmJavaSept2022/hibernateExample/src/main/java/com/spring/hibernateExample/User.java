package com.spring.hibernateExample;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="HibernateUsers")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SerialNo")
	private Long id;
	@Column(name="user_name")
	private String username;
	@Column(name="User_password")
	private String password;
	@Column(name="isActive")
	private boolean active;
	@ManyToMany
	private List<Role> roles;
	
	public User(String username, String password, boolean active) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;
	} 
	
}
