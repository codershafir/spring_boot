package com.springboot.practise.subject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practise.course.entity.CourseEntity;
import com.springboot.practise.course.service.CourseService;
import com.springboot.practise.subject.entity.SubjectEntity;
import com.springboot.practise.subject.service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/courses/{courseId}/subjects")
	public List<SubjectEntity> getAllSubjects(@PathVariable int courseId) {
		return subjectService.getAllSubjects(courseId);
	}
	
	@RequestMapping("/courses/{courseId}/subjects/{subjectId}")
	public SubjectEntity getSubject(@PathVariable int subjectId) {
		return subjectService.getSubject(subjectId);
	}
	
	@RequestMapping(value = "/courses/{courseId}/subjects",method = RequestMethod.POST)
	public void addSubject(@RequestBody SubjectEntity subjectEntity, @PathVariable int courseId) {
		subjectService.addSubject(subjectEntity,courseId);
	}
	
	@RequestMapping(value = "/courses/{courseId}/subjects",method = RequestMethod.PUT)
	public void updateSubject(@RequestBody SubjectEntity subjectEntity,@PathVariable int courseId) {
		subjectService.updateSubject(subjectEntity,courseId);
	}
	
	@RequestMapping(value = "/courses/{courseId}/subjects/{subjectId}",method = RequestMethod.DELETE)
	public void deleteSubject(@PathVariable int subjectId) {
		subjectService.deleteSubject(subjectId);
	}
	
}
