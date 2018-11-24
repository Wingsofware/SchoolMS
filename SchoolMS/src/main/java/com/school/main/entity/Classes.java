package com.school.main.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLASSES")
public class Classes implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CID")
	private int cid;
	@Column(name="CNAME")
	private String cname;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="cid", referencedColumnName="cid")
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
	public Classes() {
		// TODO Auto-generated constructor stub
	}
	public Classes(int cid, String cname, List<ClassDivision> classDivision) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.classDivision = classDivision;
	}
}
