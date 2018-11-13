package com.school.main.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLASS_DIV")
public class ClassDivision implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CDID")
	private int cdid;
	@ManyToOne
	@Column(name="CID")
	private Classes classes;
	@ManyToOne
	@Column(name="DIVISION")
	private Division division;
	
	public int getCdid() {
		return cdid;
	}
	public void setCdid(int cdid) {
		this.cdid = cdid;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public Division getDivision() {
		return division;
	}
	public void setDivision(Division division) {
		this.division = division;
	}
	@Override
	public String toString() {
		return "Class_Division [cdid=" + cdid + ", classes=" + classes + ", division=" + division + "]";
	}

}
