package com.Final.RestService.Springboot.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.GeneratedValue;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Final.RestService.Springboot.entity.Student;
import com.Final.RestService.Springboot.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentrepository;

	@PostMapping("/api/savingStudents")
	public ResponseEntity<Student> savingStudentData(@RequestBody Student student) {
		return new ResponseEntity<>(studentrepository.save(student), HttpStatus.CREATED);
	}
	
	
	@GetMapping("/api/getAllData")
	public ResponseEntity<List<Student>> gettingStudentData() {
		return new ResponseEntity<>(studentrepository.findAll(), HttpStatus.OK);
	}
	
	
	@GetMapping("/api/getById/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable long id){
		Optional<Student> studentById = studentrepository.findById(id);
		
		if(studentById.isPresent()) {
			return new ResponseEntity<>(studentById.get(),HttpStatus.OK);

		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@PutMapping("/api/modifyStudentByID/{id}")
	public ResponseEntity<Student> saveStudentById(@PathVariable long id,@RequestBody Student student){
		Optional<Student> studentById = studentrepository.findById(id);
		
		if(studentById.isPresent()) {
			studentById.get().setStudentName(student.getStudentName());
			studentById.get().setStudentEmail(student.getStudentEmail());
			studentById.get().setStudentAddress(student.getStudentAddress());
			
			return new ResponseEntity<>(studentrepository.save(studentById.get()), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	@DeleteMapping("/api/deleteById/{id}")
	public ResponseEntity<Student> deleteStudentById(@PathVariable long id){
		Optional<Student> studentById = studentrepository.findById(id);
		
		if(studentById.isPresent()) {
			studentrepository.deleteById(id);
			return new ResponseEntity<>( HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	

	
}
