package com.Final.RestService.Springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String studentName;
	private String studentEmail;
	private String studentAddress;
	
	public Student(long id, String studentName, String studentEmail, String studentAddress) {
		this.id = id;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentAddress = studentAddress;
	}

	public Student() {

	}

	
	public long getId() {
		return id;
	}

	
	public String getStudentName() {
		return studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentEmail=" + studentEmail
				+ ", studentAddress=" + studentAddress + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
