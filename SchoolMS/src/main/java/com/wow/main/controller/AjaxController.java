package com.wow.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wow.main.dao.StudentRepo;
import com.wow.main.dao.TeacherRepo;
import com.wow.main.model.Student;
import com.wow.main.model.Teacher;

@RestController
public class AjaxController {

	@Autowired
	StudentRepo srepo;
	
	@RequestMapping("/getallStudentsAjax")
	public List<Student> addallStudentsAjax()
	{
		List<Student> sd= srepo.findAll();
		return sd;
	}
	
	@Autowired
	TeacherRepo trepo;
	
	@RequestMapping("/getallTeachersAjax")
	public List<Teacher> getallTeachersAjax()
	{
		List<Teacher> tr= trepo.findAll();
		return tr;
	}
	
}
