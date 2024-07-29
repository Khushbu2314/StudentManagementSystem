package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CourseDao;
import com.model.ClassRoom;
import com.model.Course;
@Service

public class CourseService {
	@Autowired
	private CourseDao dao;
	public Course save(Course c) {
		return dao.save(c);
	}
	
	public List<Course> getAll(){
		return dao.findAll();
	}
	
	public Course getById(int id) {
		return dao.findById(id);
	}
	public List<Course> getAllByName(String name){
		return dao.findByName(name);
	}
	public Course update(int id, Course c) {
		
		if(getById(id)!=null) {

			c.setId(id);
			return dao.save(c);
		}
		return null;
	}
	


}
