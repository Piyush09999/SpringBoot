package com.rt.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rt.Entities.Student;
@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

	// Student findByName(String name);

//	@Query(value="select * from studentdata where name=?",nativeQuery = true)
//	List<Student> stn(String name);

	//JPQL
	@Query(value = "select s from Student s where s.name=:n", nativeQuery = false)
	List<Student>stn(@Param("n")String n);

}
