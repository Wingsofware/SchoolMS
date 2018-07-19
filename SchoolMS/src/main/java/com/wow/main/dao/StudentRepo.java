package com.wow.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wow.main.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
	
	List<Student> findByAdmissionno(long adno);
	

}
