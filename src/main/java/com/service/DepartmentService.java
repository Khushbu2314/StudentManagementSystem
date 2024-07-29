package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DepartmentDao;
import com.model.Department;
@Service
public class DepartmentService{
	@Autowired
	private DepartmentDao dao;
	
	public Department save(Department d) {
		return dao.save(d);
	}
	public List<Department> getAll(){
		return dao.findAll();
	}
	public Department getById(int id){
		return dao.findById(id);
	}
	public List<Department> getAllByName(String name){
		return dao.findByName(name);
	}
	public Department update(int id, Department d) {
		if(getById(id)!=null) {
			d.setId(id);
			return dao.save(d);
		}
		return null;
	}
}
