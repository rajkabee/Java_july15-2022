package com.rajkabee.springFramework.annotationConfiguration;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component(value = "smartphones")
public class Category {
	//@Value("${category.id}")
	int id;
	//@Value("${category.name}")
	String name;
}
