package com.school.main.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(alphabetic=true)
@Entity
@Table(name="CLASS_DIV")
public class ClassDivision implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CDID")
	private int cdid;
	@Column(name="CID")
	private int cid;
	@Column(name="DIVISION")
	private String division;
	
	public int getCdid() {
		return cdid;
	}
	public void setCdid(int cdid) {
		this.cdid = cdid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	@Override
	public String toString() {
		return "ClassDivision [cdid=" + cdid + ", cid=" + cid + ", division=" + division + "]";
	}
	public ClassDivision(int cdid, int cid, String division) {
		super();
		this.cdid = cdid;
		this.cid = cid;
		this.division = division;
	}
	public ClassDivision() {

	}
}
