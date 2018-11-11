package com.school.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	List<Student> findByAdmissionno(long adno);
	

}
