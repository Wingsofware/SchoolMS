package com.school.main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SID")
	private long sid;
	@Column(name="ADM_NO")
	private long admissionNo;
	@Column(name="ADM_DATE")
	private Date admissionDate;
	@Column(name="NAME")
	private String name;
	@Column(name="GENDER")
	private String gender;
	@Column(name="DOB")
	private String dob;
	@Column(name="FATHER")
	private String father;
	@Column(name="MOTHER")
	private String mother;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="DISTANCE")
	private double distance;
	@Column(name="BUS")
	private boolean bus;
	@Column(name="CONTACT")
	private String contact;
	@Column(name="MOBILE")
	private String mobile;
	@Column(name="RELIGION")
	private String religion;
	@Column(name="CASTE")
	private String caste;
	@Column(name="CATEGORY")
	private String category;
	@OneToOne
	@Column(name="CDID")
	private ClassDivision classDivision;
	
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public long getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(long admissionNo) {
		this.admissionNo = admissionNo;
	}
	public Date getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public boolean isBus() {
		return bus;
	}
	public void setBus(boolean bus) {
		this.bus = bus;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public ClassDivision getClassDivision() {
		return classDivision;
	}
	public void setClassDivision(ClassDivision classDivision) {
		this.classDivision = classDivision;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", admissionNo=" + admissionNo + ", admissionDate=" + admissionDate + ", name="
				+ name + ", gender=" + gender + ", dob=" + dob + ", father=" + father + ", mother=" + mother
				+ ", address=" + address + ", distance=" + distance + ", bus=" + bus + ", contact=" + contact
				+ ", mobile=" + mobile + ", religion=" + religion + ", caste=" + caste + ", category=" + category
				+ ", classDivision=" + classDivision + "]";
	}
}
