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

import com.model.Department;
import com.service.DepartmentService;

@RestController
@RequestMapping("api/Department")
public class DepartmentController {
	@Autowired
	private DepartmentService service;
	
	@PostMapping
	public Department save(@RequestBody Department d) {
		return service.save(d);
	}
	
	@GetMapping("/getAll")
	public List<Department> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getById/{id}")
	public Department getById(@PathVariable int id){
		return service.getById(id);
	}
	
	@GetMapping("/getByName/{name}")
	public List<Department> getAllByName(@PathVariable String name){
		return service.getAllByName(name);
	}
	
	@PutMapping(value="/{id}")
	public Department update(@PathVariable("id") int id, @RequestBody Department d) {
		return service.update(id, d);
	}

}
