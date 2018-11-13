package com.school.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.main.entity.ClassDivision;
import com.school.main.entity.Classes;

public interface ClassRepository extends JpaRepository<Classes, ClassDivision> {
	
	Classes findByCname(String cname);

}
