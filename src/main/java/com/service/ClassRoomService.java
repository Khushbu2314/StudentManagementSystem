package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ClassRoomDao;
import com.model.ClassRoom;
@Service
public class ClassRoomService{
	@Autowired
	private ClassRoomDao dao;
	
	
	public ClassRoom save(ClassRoom cr) {
		return dao.save(cr);
	}
	
	public List<ClassRoom> getAll(){
		return dao.findAll();
	}
	
	public ClassRoom getById(int id) {
		return dao.findById(id);
	}
	public List<ClassRoom> getAllByName(String name){
		return dao.findByName(name);
	}

	public ClassRoom update(int id, ClassRoom cr) {
		if(getById(id)!=null) {
			cr.setId(id);
			return dao.save(cr);
		}
		return null;
	}

}
