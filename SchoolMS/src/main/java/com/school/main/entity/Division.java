package com.school.main.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DIVISION")
public class Division implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DIVISION")
	private String division;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="division", referencedColumnName="division")
	private List<ClassDivision> classDivision;
	
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public List<ClassDivision> getClassDivision() {
		return classDivision;
	}
	public void setClassDivision(List<ClassDivision> classDivision) {
		this.classDivision = classDivision;
	}
	public Division(String division, List<ClassDivision> classDivision) {
		super();
		this.division = division;
		this.classDivision = classDivision;
	}
	@Override
	public String toString() {
		return "Division [division=" + division + ", classDivision=" + classDivision + "]";
	}
	public Division() {
		// TODO Auto-generated constructor stub
	}	
	
}
