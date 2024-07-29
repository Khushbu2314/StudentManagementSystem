package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{

	List<Student> findByName(String name);

	List<Student> findByPassword(String password);

	List<Student> findByEmail(String email);
	
	Student findById(int id);

}
