package com.springboot.practise.subject.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.practise.subject.entity.SubjectEntity;

public interface SubjectRepository extends CrudRepository<SubjectEntity, Integer>{
	public List<SubjectEntity> findByCourseEntityId(int courseId);
}
