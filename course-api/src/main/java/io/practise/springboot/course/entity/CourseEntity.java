package io.practise.springboot.course.entity;

public class CourseEntity {

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
