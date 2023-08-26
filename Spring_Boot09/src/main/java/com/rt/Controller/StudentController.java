package com.rt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.Entities.Student;
import com.rt.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService pk;
	
	@GetMapping("/show")
	public String hello(){
		return "hello";
	}
	
	
	@PostMapping("/student")
	public String AddStudent(@RequestBody Student s){
	
		pk.AddStudent(s);
		
		return "Student Added Sucssesfully";
		
	}
//----------------------------- Select By id   --------------------------------------------
	
	
	@PostMapping("/student/id/{id}")
	public Student getById(@PathVariable int id ){
		
		Student s = pk.getById (id);
	
	 return s;
		
	}
	//----------------------------------------- Delete -------------------------------------------
	
	
	@DeleteMapping("/student/id/{id}")
	public String deletStudent(@PathVariable int id ){
		
		Student s = pk.deletStudent (id);
	
	 return " Student Delet Succesfully";
		
	}
// ----------------------------- Update -----------------------------------------
	
	@PutMapping("/student/id/{id}")
	public String getById1(@RequestBody Student s ){
		
		 pk.getById1 (s);
		return  "Update Succesfully";
	}
//---------------------------------------- Select All Student ------------------------------------------
	@GetMapping("/AllStudent")
	public List<Student>getAllStudent(){
		
		List<Student>list=pk.getAllStudent();
		return list;
	}
//------------------------------------------- Select By Name --------------------------------------------------	
	@GetMapping("/name/{name}")
	public List<Student> getByName(@PathVariable String name){
		List<Student> s = pk. getByName(name);
		
		return s;
	}

}


	

