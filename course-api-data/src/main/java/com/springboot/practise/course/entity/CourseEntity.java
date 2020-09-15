package com.springboot.practise.course.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseEntity {

	@Id
	public int id;
	
	public String name;
	
	public CourseEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public CourseEntity() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
