package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Utility;

@RestController
@RequestMapping(value="api")
public class UtilityController {
	@Autowired
	private Utility service;
	
	@PutMapping(value="/classroom-student/add-student-class/{sid}/room/{roomId}")
	public Boolean addDataStudentClassRoom(@PathVariable int sid, @PathVariable int roomId) {
		return service.addDataStudentClassRoom(sid, roomId);
	}
	
	@PutMapping(value="/course-department/add-course-department/course/{cid}/dept/{depiId}")
	public Boolean addDataCourseDepartment(@PathVariable int cid, @PathVariable int depiId) {
		return service.addDataCourseDepartment(cid, depiId);
	}
}
