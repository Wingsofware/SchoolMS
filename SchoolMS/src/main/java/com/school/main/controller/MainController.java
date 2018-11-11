package com.school.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.school.main.entity.Class_Division;
import com.school.main.entity.Classes;
import com.school.main.entity.Student;
import com.school.main.entity.Teacher;
import com.school.main.repository.ClassRepository;
import com.school.main.repository.StudentRepository;
import com.school.main.repository.TeacherRepository;


// TODO: Auto-generated Javadoc
/**
 * The Class MainController.
 */
@Controller
public class MainController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	ClassRepository classRepository;
	
	@Autowired
	TeacherRepository teacherRepository;

	
	/**
	 * Adds the student.
	 *
	 * @param cname the cname
	 * @param division the division
	 * @param student the student
	 * @return the model and view
	 */
	@RequestMapping("/addStudent")
	public ModelAndView addStudent(@RequestParam("classes_cname") String cname,@RequestParam("classes_division") String division,@ModelAttribute Student student)
	{
		ModelAndView mv=new ModelAndView();
		Class_Division cd=new Class_Division();
		cd.setCname(cname);
		cd.setDivision(division);
		Classes cl=classRepository.getOne(cd);
		student.setClasses(cl);
		studentRepository.save(student);
		mv.addObject("student", student);
		mv.setViewName("studentview");
		return mv;
	}
	
	/**
	 * Update student.
	 *
	 * @param student the student
	 * @return the model and view
	 */
	@RequestMapping("/updateStudent")
	public ModelAndView updateStudent(Student student)
	{
		ModelAndView mv=new ModelAndView();
		studentRepository.save(student);
		mv.addObject("student", student);
		mv.setViewName("studentview");
		return mv;
	}
	
	/**
	 * Gets the student.
	 *
	 * @param adno the adno
	 * @return the student
	 */
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam("adno") long adno)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("student", (Student) studentRepository.findByAdmissionno(adno));
		mv.setViewName("studentview");
		return mv;
	}
	
	/**
	 * Gets the all students.
	 *
	 * @return the all students
	 */
	@RequestMapping("/getallStudents")
	public ModelAndView getAllStudents()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("students", studentRepository.findAll());
		mv.setViewName("studentsview");
		return mv;
	}
////STUDENT CONTROLLER ENDS//////
	
	/**
	 * Adds the teacher.
	 *
	 * @param teacher the teacher
	 * @return the model and view
	 */
	@RequestMapping("/addTeacher")
	public ModelAndView addTeacher(Teacher teacher)
	{
		ModelAndView mv=new ModelAndView();
		teacherRepository.save(teacher);
		mv.addObject("teacher", teacher);
		mv.setViewName("teacherview");
		return mv;
	}
	
	/**
	 * Update teacher.
	 *
	 * @param teacher the teacher
	 * @return the model and view
	 */
	@RequestMapping("/updateTeacher")
	public ModelAndView updateTeacher(Teacher teacher)
	{
		ModelAndView mv=new ModelAndView();
		teacherRepository.save(teacher);
		mv.addObject("teacher", teacher);
		mv.setViewName("teacherview");
		return mv;
	}
	
	/**
	 * Gets the teacher.
	 *
	 * @param tid the tid
	 * @return the teacher
	 */
	@RequestMapping("/getTeacher")
	public ModelAndView getTeacher(@RequestParam("tid") int tid)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("teacher", teacherRepository.findById(tid));
		mv.setViewName("teacherview");
		return mv;
	}
	
	/**
	 * Gets the all teachers.
	 *
	 * @return the all teachers
	 */
	@RequestMapping("/getallTeachers")
	public ModelAndView getallTeachers()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("teachers", teacherRepository.findAll());
		mv.setViewName("teachersview");
		return mv;
	}
////TEACHER CONTROLLER ENDS//////

////CLASS CONTROLLER ENDS//////
	
	/**
 * Adds the class.
 *
 * @param classes the classes
 * @return the model and view
 */
@RequestMapping("/addClass")
	public ModelAndView addClass(Classes classes)
	{
		ModelAndView mv=new ModelAndView();
		classRepository.save(classes);
		return mv;
	}
	
	
}
