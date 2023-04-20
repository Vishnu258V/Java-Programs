package com.Final.RestService.Springboot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Final.RestService.Springboot.entity.Student;


public interface StudentRepository  extends JpaRepository<Student,Long>{
	

}
