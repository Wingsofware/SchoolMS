package com.wow.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private long sid;
	private long admissionno;
	private String admissiondate;
	private String name;
	private String gender;
	private String dob;
	private String father;
	private String mother;
	private String address;
	private String city;
	private String distance;
	private String bus;
	private String contactno;
	private String religion;
	private String caste;
	private String category;
	public long getSid() {
		return sid;
	}
	public void setSid(long sid) {
		this.sid = sid;
	}
	public long getAdmissionno() {
		return admissionno;
	}
	public void setAdmissionno(long admissionno) {
		this.admissionno = admissionno;
	}
	public String getAdmissiondate() {
		return admissiondate;
	}
	public void setAdmissiondate(String admissiondate) {
		this.admissiondate = admissiondate;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getBus() {
		return bus;
	}
	public void setBus(String bus) {
		this.bus = bus;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
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
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", admissionno=" + admissionno + ", admissiondate=" + admissiondate + ", name="
				+ name + ", gender=" + gender + ", dob=" + dob + ", father=" + father + ", mother=" + mother
				+ ", address=" + address + ", city=" + city + ", distance=" + distance + ", bus=" + bus + ", contactno="
				+ contactno + ", religion=" + religion + ", caste=" + caste + ", category=" + category + "]";
	}

}
