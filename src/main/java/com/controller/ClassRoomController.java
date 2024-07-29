package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.ClassRoom;
import com.service.ClassRoomService;

@RestController
@RequestMapping("api/classroom")
public class ClassRoomController {
	@Autowired
	private ClassRoomService service;
	
	@PostMapping
	public ClassRoom save(@RequestBody ClassRoom cr) {
		return service.save(cr);
	}
	
	@GetMapping
	public List<ClassRoom> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public ClassRoom getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@GetMapping("/name/{name}")
	public List<ClassRoom> getAllByName(@PathVariable String name){
		return service.getAllByName(name);
	}
	
	@PutMapping(value="/{id}")
	public ClassRoom update(@PathVariable("id") int id, @RequestBody ClassRoom cr) {
		return service.update(id, cr);
	}

}
