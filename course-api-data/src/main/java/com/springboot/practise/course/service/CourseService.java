package com.springboot.practise.course.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.practise.course.entity.CourseEntity;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courserepository;
	
public List<CourseEntity> getAllCourses() {
	List<CourseEntity> courseList = new ArrayList<>();
	courserepository.findAll().forEach(course->{
		courseList.add(course);
	});
	return courseList;
}

public CourseEntity getCourse(int id) {
	return courserepository.findById(id).get();
}

public void addCourse(CourseEntity courseEntity) {
	courserepository.save(courseEntity);
}

public void updateCourse(CourseEntity courseEntity) {
	courserepository.save(courseEntity);
}

public void deleteCourse(int id) {
	courserepository.deleteById(id);
}

}
