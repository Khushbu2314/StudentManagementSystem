package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.ClassRoom;

@Repository
public interface ClassRoomDao extends JpaRepository<ClassRoom, Integer>{
	ClassRoom save(ClassRoom cr);

	List<ClassRoom> findByName(String name);
	
	ClassRoom findById(int id);

}
