package com.rajkabee.api.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		long id;
		String name;
		String address;
		long contact;
		String Citizenship_no;
		public Account(String name, String address, long contact, String citizenship_no) {
			super();
			this.name = name;
			this.address = address;
			this.contact = contact;
			Citizenship_no = citizenship_no;
		}
		
		
}
