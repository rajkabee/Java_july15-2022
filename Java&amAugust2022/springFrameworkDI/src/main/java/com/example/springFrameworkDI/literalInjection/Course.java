package com.example.springFrameworkDI.literalInjection;

public class Course {
	int id;
	String title;
	int duration;
	
	public int getId() {
		return id;
	}
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Course(int id, String title, int duration) {
		super();
		this.id = id;
		this.title = title;
		this.duration = duration;
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


	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", duration=" + duration + "]";
	}
	
}
