package com.wow.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wow.main.dao.StudentRepository;
import com.wow.main.model.Student;

@Controller
public class MainController {
	
	@Autowired
	StudentRepository srepo;
	
	@RequestMapping("/addStudent")
	public ModelAndView addStudent(Student sd)
	{
		ModelAndView mv=new ModelAndView();
		srepo.save(sd);
		mv.addObject("student", sd);
		mv.setViewName("studentview");
		return mv;
	}
	
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(Student sd)
	{
		ModelAndView mv=new ModelAndView();
		srepo.save(sd);
		mv.addObject("student", sd);
		mv.setViewName("studentview");
		return mv;
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView addStudent(@RequestParam("adno") long adno)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("student", (Student) srepo.findByAdmissionno(adno));
		mv.setViewName("studentview");
		return mv;
	}
	
	@RequestMapping("/getallStudent")
	public ModelAndView addallStudent()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("students", srepo.findAll());
		mv.setViewName("studentsview");
		return mv;
	}
}
