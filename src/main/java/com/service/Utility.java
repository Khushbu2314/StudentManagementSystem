package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.ClassRoom;
import com.model.Course;
import com.model.Department;
import com.model.Student;

@Service
public class Utility {
	@Autowired
	private ClassRoomService croomService;
	
	@Autowired
	private StudentService studService;
	
	@Autowired
	private DepartmentService deptService;
	
	@Autowired
	private CourseService courseService;
	
	public Boolean addDataStudentClassRoom(int sid, int roomId) {
		
		ClassRoom classRoom = croomService.getById(roomId); // class room fetch from database by id
		
		Student student = studService.getById(sid); // student fetch from database by id
		
		if(classRoom==null) {
			return false;
		}else if(student==null) {
			return null;
		}
		
		
		List<ClassRoom> csList = new ArrayList<>();
		csList.add(classRoom);
		student.setClassRoomList(csList);
		
		
		List<Student> stList = new ArrayList<>();
		stList.add(student);
		classRoom.setStudentList(stList);
		
		croomService.save(classRoom);
		studService.save(student);
		
		return true;
	}

	public Boolean addDataCourseDepartment(int cid, int depiId) {
		// TODO Auto-generated method stub
		
		Course course = courseService.getById(cid);
		Department department = deptService.getById(depiId);
		
		List<Department> dlist = new ArrayList<>();
		dlist.add(department);
		
		List<Course> clist = new ArrayList<>();
		clist.add(course);
		
		department.setCourseList(clist);
		deptService.save(department);
		
		course.setDepartmentList(dlist);
		courseService.save(course);
		return true;
	}
	
	
//	public Boolean 
	
	

}
