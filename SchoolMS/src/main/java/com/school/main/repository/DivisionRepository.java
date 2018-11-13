package com.school.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.main.entity.Division;

public interface DivisionRepository extends JpaRepository<Division, String> {
	
}
