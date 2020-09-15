package com.springboot.practise.course.service;

import org.springframework.data.repository.CrudRepository;

import com.springboot.practise.course.entity.CourseEntity;

public interface CourseRepository extends CrudRepository<CourseEntity, Integer>{
	
}
