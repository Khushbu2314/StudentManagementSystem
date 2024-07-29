package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Department;

@Repository
public interface DepartmentDao extends JpaRepository<Department, Integer>{

	List<Department> findByName(String name);
	
	Department findById(int id);

}
