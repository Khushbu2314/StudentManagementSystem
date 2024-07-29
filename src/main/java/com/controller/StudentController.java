package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentService;

@RestController
@RequestMapping("api/Student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping
	public Student save(@RequestBody Student s) {
		
		return service.save(s);
	}
	
	@GetMapping("/getAll")
	public List<Student> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public Student getById(@PathVariable int id) {
		return service.getById(id);
	}
	
	@GetMapping("/getAllByName/{name}")
	public List<Student> getAllByName(@PathVariable String name){
		return service.getAllByName(name);
	}
	
	@GetMapping("/getByemail/{email}")
	public List<Student> getAllByEmail(@PathVariable String email){
		return service.getAllByEmail(email);
	}
	
	@PostMapping(value="/{id}")
	public Student update(@PathVariable("id") int id, @RequestBody Student s) {
		return service.update(id, s);
	}

}
