package com.wow.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wow.main.dao.ClassRepo;
import com.wow.main.dao.StudentRepo;
import com.wow.main.dao.TeacherRepo;
import com.wow.main.model.Class_Division;
import com.wow.main.model.Classes;
import com.wow.main.model.Student;
import com.wow.main.model.Teacher;

@Controller
public class MainController {
	
////STUDENT CONTROLLER STARTS//////
	@Autowired
	StudentRepo studentRepo;
	@Autowired
	ClassRepo classRepo;
	
	@RequestMapping("/addStudent")
	public ModelAndView addStudent(@RequestParam("classes_cname") String cname,@RequestParam("classes_division") String division,@ModelAttribute Student student)
	{
		ModelAndView mv=new ModelAndView();
		Class_Division cd=new Class_Division();
		cd.setCname(cname);
		cd.setDivision(division);
		Classes cl=classRepo.getOne(cd);
		student.setClasses(cl);
		studentRepo.save(student);
		mv.addObject("student", student);
		mv.setViewName("studentview");
		return mv;
	}
	
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(Student student)
	{
		ModelAndView mv=new ModelAndView();
		studentRepo.save(student);
		mv.addObject("student", student);
		mv.setViewName("studentview");
		return mv;
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam("adno") long adno)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("student", (Student) studentRepo.findByAdmissionno(adno));
		mv.setViewName("studentview");
		return mv;
	}
	
	@RequestMapping("/getallStudents")
	public ModelAndView getAllStudents()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("students", studentRepo.findAll());
		mv.setViewName("studentsview");
		return mv;
	}
////STUDENT CONTROLLER ENDS//////
	
////TEACHER CONTROLLER STARTS//////
	@Autowired
	TeacherRepo teacherRepo;
	
	@RequestMapping("/addTeacher")
	public ModelAndView addTeacher(Teacher teacher)
	{
		ModelAndView mv=new ModelAndView();
		teacherRepo.save(teacher);
		mv.addObject("teacher", teacher);
		mv.setViewName("teacherview");
		return mv;
	}
	
	@RequestMapping("/updateTeacher")
	public ModelAndView updateTeacher(Teacher teacher)
	{
		ModelAndView mv=new ModelAndView();
		teacherRepo.save(teacher);
		mv.addObject("teacher", teacher);
		mv.setViewName("teacherview");
		return mv;
	}
	
	@RequestMapping("/getTeacher")
	public ModelAndView getTeacher(@RequestParam("tid") int tid)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("teacher", teacherRepo.findById(tid));
		mv.setViewName("teacherview");
		return mv;
	}
	
	@RequestMapping("/getallTeachers")
	public ModelAndView getallTeachers()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("teachers", teacherRepo.findAll());
		mv.setViewName("teachersview");
		return mv;
	}
////TEACHER CONTROLLER ENDS//////

////CLASS CONTROLLER ENDS//////
	
	@RequestMapping("/addClass")
	public ModelAndView addClass(Classes classes)
	{
		ModelAndView mv=new ModelAndView();
		classRepo.save(classes);
		return mv;
	}
	
	
}
