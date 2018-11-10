package com.school.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String Loign()
	{
		return "login";
	}
	
	@RequestMapping("home.htm")
	public String Home()
	{
		return "home";
	}
	
	@RequestMapping("/add_student.htm")
	public String AddStudentView()
	{
		return "addstudent";
	}

	@RequestMapping("/add_teacher.htm")
	public String AddTeacherView()
	{
		return "addteacher";
	}
	
	@RequestMapping("/add_class.htm")
	public String AddClassView()
	{
		return "addclass";
	}
	
}
