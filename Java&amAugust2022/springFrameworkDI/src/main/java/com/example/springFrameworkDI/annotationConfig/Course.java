package com.example.springFrameworkDI.annotationConfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("course")
public class Course{
	int id;
	String title;
	int duration;
	@Autowired
	@Qualifier("literature")
	Category category;
	
	@PostConstruct
	public void init() {
		System.out.println("Course Bean Created...");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Course Bean Destroyed...");
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Course(int id, String title, int duration, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
		this.category = category;
	}

	

	public Course(int id, String title, int duration) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}
	


	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", duration=" + duration + ", category=" + category + "]";
	}



	
	
}
