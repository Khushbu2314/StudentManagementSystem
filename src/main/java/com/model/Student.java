package com.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String password;
	private String email;
	private double contact_info;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getContact_info() {
		return contact_info;
	}
	public void setContact_info(double contact_info) {
		this.contact_info = contact_info;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", contact_info=" + contact_info + "]";
	}
	
	
	@ManyToMany
	@JoinTable(name = "studentList")
	private List<ClassRoom> classRoomList;
	public List<ClassRoom> getClassRoomList() {
		return classRoomList;
	}
	public void setClassRoomList(List<ClassRoom> classRoomList) {
		this.classRoomList = classRoomList;
	}
	
	


}
