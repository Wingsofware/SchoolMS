package com.school.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.main.entity.Student;
import com.school.main.entity.Teacher;
import com.school.main.repository.StudentRepository;
import com.school.main.repository.TeacherRepository;

@RestController
public class AjaxController {

	@Autowired
	StudentRepository srepo;
	@Autowired
	TeacherRepository trepo;
		
	@RequestMapping("/getAllStudentsAjax")
	public List<Student> addAllStudentsAjax()
	{
		List<Student> sd= srepo.findAll();
		return sd;
	}
	
	@RequestMapping("/getAllTeachersAjax")
	public List<Teacher> getAllTeachersAjax()
	{
		List<Teacher> tr= trepo.findAll();
		return tr;
	}
	
}
