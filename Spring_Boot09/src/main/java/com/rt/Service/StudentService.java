package com.rt.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rt.Dao.StudentDao;
import com.rt.Entities.Student;

@Component
public class StudentService {

	@Autowired
	StudentDao Dao;
	
	public void AddStudent(Student s) {
		
		Dao.save(s);
		
	}
//------------------------------------ Select ---------------------------------------------
	public Student getById(int id) {
		
		Student s1 = null;
		
		Optional < Student > s = Dao.findById(id);
		
		if (s.isPresent()) {
			
			s1 = s.get();
					
					return s1 ;
			
		} 
		return s1;
		

	}
//----------------------------------------------------- Delet -----------------------------------------------
	public Student deletStudent(int id) {
		
		Dao.deleteById(id);
		return null;
	}
//------------------------------------- Update -------------------------------------
	
	
	public Student getById1(Student s) {
		Dao.save(s);
	
		return null;
	}
	
	//------------------------------- Select All -------------------------------------------
	
	public List<Student> getAllStudent() {
		List<Student>list=Dao.findAll();
		return list;
	}
//------------------------------------------ Select for Name -------------------
	public Student findByName(String name) {
		Student list = Dao.findByName(name);
		
		return list;
	}
	
	

}
