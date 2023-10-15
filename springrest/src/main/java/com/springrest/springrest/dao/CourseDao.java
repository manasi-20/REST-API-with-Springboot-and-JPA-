package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entities.Cources;

public interface CourseDao extends JpaRepository<Cources,Long> {

}
