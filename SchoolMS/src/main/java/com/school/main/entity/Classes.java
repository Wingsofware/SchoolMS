package com.school.main.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Classes {

	@EmbeddedId
	private Class_Division class_division;
	@OneToOne
	private Teacher teacher;
	public Class_Division getClass_division() {
		return class_division;
	}
	public void setClass_division(Class_Division class_division) {
		this.class_division = class_division;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
