package com.wow.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wow.main.dao.StudentRepo;
import com.wow.main.dao.TeacherRepo;
import com.wow.main.model.Student;
import com.wow.main.model.Teacher;

@Controller
public class MainController {
	
////STUDENT CONTROLLER STARTS//////
	@Autowired
	StudentRepo srepo;
	
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
	public ModelAndView getStudent(@RequestParam("adno") long adno)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("student", (Student) srepo.findByAdmissionno(adno));
		mv.setViewName("studentview");
		return mv;
	}
	
	@RequestMapping("/getallStudents")
	public ModelAndView getallStudents()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("students", srepo.findAll());
		mv.setViewName("studentsview");
		return mv;
	}
////STUDENT CONTROLLER ENDS//////
	
////STUDENT CONTROLLER STARTS//////
	@Autowired
	TeacherRepo trepo;
	
	@RequestMapping("/addTeacher")
	public ModelAndView addTeacher(Teacher tr)
	{
		ModelAndView mv=new ModelAndView();
		trepo.save(tr);
		mv.addObject("teacher", tr);
		mv.setViewName("teacherview");
		return mv;
	}
	
	@RequestMapping("/updateTeacher")
	public ModelAndView updateTeacher(Teacher tr)
	{
		ModelAndView mv=new ModelAndView();
		trepo.save(tr);
		mv.addObject("teacher", tr);
		mv.setViewName("teacherview");
		return mv;
	}
	
	@RequestMapping("/getTeacher")
	public ModelAndView getTeacher(@RequestParam("tid") int tid)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("teacher", trepo.findById(tid));
		mv.setViewName("teacherview");
		return mv;
	}
	
	@RequestMapping("/getallTeachers")
	public ModelAndView getallTeachers()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("teachers", trepo.findAll());
		mv.setViewName("teachersview");
		return mv;
	}
////STUDENT CONTROLLER ENDS//////
	
	
	
}
