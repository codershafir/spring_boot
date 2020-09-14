package io.practise.springboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.practise.springboot.course.entity.CourseEntity;

@Service
public class CourseService {
	private List<CourseEntity> courseList = new ArrayList<>(Arrays.asList(
			new CourseEntity(1, "CSE"),
			new CourseEntity(2, "MECH"),
			new CourseEntity(3, "ECE")));
	
public List<CourseEntity> getAllCourses() {
	return courseList;
}

public CourseEntity getCourse(int id) {
	return courseList.stream().filter(course->course.getId()==id).findFirst().get();
}

public void addCourse(CourseEntity courseEntity) {
	courseList.add(courseEntity);
}

public void deleteCourse(int id) {
	courseList.removeIf(courseEntity->courseEntity.getId()==id);
}

public void updateCourse(int id, CourseEntity courseEntity) {
	for(int i=0;i<courseList.size();i++) {
		CourseEntity tempCourseEntity = courseList.get(i);
		if(tempCourseEntity.getId()==id) {
			courseList.set(i, courseEntity);		
		}
	}
}

}
