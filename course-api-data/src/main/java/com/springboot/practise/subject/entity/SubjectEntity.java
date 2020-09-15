package com.springboot.practise.subject.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.springboot.practise.course.entity.CourseEntity;

@Entity
public class SubjectEntity {

	@Id
	private int id;
	
	private String name;
	
	@ManyToOne
	private CourseEntity courseEntity;
	
	public CourseEntity getCourseEntity() {
		return courseEntity;
	}

	public void setCourseEntity(CourseEntity courseEntity) {
		this.courseEntity = courseEntity;
	}

	public SubjectEntity(int id, String name, CourseEntity courseEntity) {
		super();
		this.id = id;
		this.name = name;
		this.courseEntity = courseEntity;
	}
	
	public SubjectEntity() {
		
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
