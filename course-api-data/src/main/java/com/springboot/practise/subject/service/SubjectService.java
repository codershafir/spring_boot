package com.springboot.practise.subject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.practise.course.entity.CourseEntity;
import com.springboot.practise.subject.entity.SubjectEntity;

@Service
public class SubjectService {
	@Autowired
	private SubjectRepository subjectRepository;
	
public List<SubjectEntity> getAllSubjects(int courseId) {
	List<SubjectEntity> subjectList = new ArrayList<>();
	subjectRepository.findByCourseEntityId(courseId).forEach(subjectList::add);
	return subjectList;
}

public SubjectEntity getSubject(int subjectId) {
	return subjectRepository.findById(subjectId).get();
}

public void addSubject(SubjectEntity subjectEntity, int courseId) {
	subjectEntity.setCourseEntity(new CourseEntity(courseId,""));
	subjectRepository.save(subjectEntity);
}

public void updateSubject(SubjectEntity subjectEntity, int courseId) {
	subjectEntity.setCourseEntity(new CourseEntity(courseId,""));
	subjectRepository.save(subjectEntity);
}

public void deleteSubject(int subjectId) {
	subjectRepository.deleteById(subjectId);
}

}
