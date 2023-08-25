package com.rt.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.Entities.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

	Student findByName(String name);

	

}
