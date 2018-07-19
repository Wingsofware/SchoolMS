package com.wow.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wow.main.model.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer>{

}
