package com.school.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.main.entity.ClassDivision;
import com.school.main.entity.Classes;
import com.school.main.entity.Division;

public interface ClassDivisionRepository extends JpaRepository<ClassDivision, Integer> {
	
	ClassDivision findByClassesInAndDivisionIn(Classes classes,Division division);

}
