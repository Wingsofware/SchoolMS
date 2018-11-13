package com.school.main.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLASSES")
public class Classes {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CID")
	private int cid;
	@Column(name="CNAME")
	private String cname;
	@OneToMany(mappedBy="classes")
	private List<ClassDivision> classDivision;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<ClassDivision> getClassDivision() {
		return classDivision;
	}
	public void setClassDivision(List<ClassDivision> classDivision) {
		this.classDivision = classDivision;
	}
	@Override
	public String toString() {
		return "Classes [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
