package com.school.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.school.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}
