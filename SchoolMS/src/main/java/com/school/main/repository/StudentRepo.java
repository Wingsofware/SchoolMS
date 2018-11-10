package com.school.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.main.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
	
	List<Student> findByAdmissionno(long adno);
	

}
