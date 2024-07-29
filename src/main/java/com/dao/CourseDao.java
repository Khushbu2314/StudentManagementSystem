package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Course;
@Repository
public interface CourseDao extends JpaRepository<Course, Integer>{
	
	Course save(Course c);

	List<Course> findByName(String name);
	
	Course findById(int id);

}
