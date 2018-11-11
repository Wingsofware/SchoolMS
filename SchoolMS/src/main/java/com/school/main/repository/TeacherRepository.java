package com.school.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.main.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{

}
