package io.practise.springboot.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.practise.springboot.course.entity.CourseEntity;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/courses")
	public List<CourseEntity> getAllCourses() {
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/courses/{id}")
	public CourseEntity getCourse(@PathVariable int id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(value = "/courses",method = RequestMethod.POST)
	public void addCourse(@RequestBody CourseEntity courseEntity) {
		courseService.addCourse(courseEntity);
	}
	
	@RequestMapping(value = "/courses/{id}",method = RequestMethod.PUT)
	public void addCourse(@PathVariable int id,@RequestBody CourseEntity courseEntity) {
		courseService.updateCourse(id,courseEntity);
	}
	
	@RequestMapping(value = "/courses/{id}",method = RequestMethod.DELETE)
	public void addCourse(@PathVariable int id) {
		courseService.deleteCourse(id);
	}
	
}
