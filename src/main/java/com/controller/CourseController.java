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

import com.model.Course;
import com.service.CourseService;

@RestController
@RequestMapping("api/course")
public class CourseController {
	@Autowired
	
	private CourseService service;
	
	@PostMapping
	public Course save(@RequestBody Course c) {
		return service.save(c);
	}
	
	@GetMapping
	public List<Course> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public Course getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@GetMapping("/getByName/{name}")
	public List<Course> getAllByName(@PathVariable String name){
		return service.getAllByName(name);
	}
	
	@PutMapping(value="/{id}")
	public Course update(@PathVariable("id") int id, @RequestBody Course c) {

		return service.update(id, c);
	}
	

}
