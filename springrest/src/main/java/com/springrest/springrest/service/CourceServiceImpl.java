package com.springrest.springrest.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Cources;

@Service
public class CourceServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Cources> getCourses(){
		
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}
	@Override
	public Cources addCourse(Cources cource) {
		// TODO Auto-generated method stub
		courseDao.save(cource);
		return cource;
	}
	@Override
	public Cources getCourse(long courseId) {
		// TODO Auto-generated method stub
		return courseDao.getReferenceById(courseId);
	}
	@Override
	public Cources updateCourse(Cources cource) {
		// TODO Auto-generated method stub
		courseDao.save(cource);
		return cource;
	}
	@Override
	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		Cources course=courseDao.getReferenceById(parseLong);
		courseDao.delete(course);
	}
}
