package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Cources;

public interface CourseService {
	public List<Cources> getCourses();
	public Cources addCourse(Cources cource);
	public Cources getCourse(long courseId);
	public Cources updateCourse(Cources cource);
	public void deleteCourse(long parseLong);
}
