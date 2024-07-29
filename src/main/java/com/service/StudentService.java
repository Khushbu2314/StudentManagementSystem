package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.ClassRoom;
import com.model.Student;
@Service
public class StudentService{
	@Autowired
	private StudentDao dao;
	
	public Student save(Student s) {
		return dao.save(s);
	}
	public List<Student> getAll(){
		return dao.findAll();
	}
	public Student getById(int id) {
		return dao.findById(id);
	}
	public List<Student> getAllByName(String name){
		return dao.findByName(name);
	}
	public List<Student> getAllByEmail(String email){
		return dao.findByEmail(email);
	}
	public Student update(int id, Student s) {
		if(getById(id)!=null) {
			s.setId(id);
			return dao.save(s);
		}
		return null;
	}


}
