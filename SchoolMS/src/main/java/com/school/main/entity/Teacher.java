package com.school.main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="TID")
	private int tid;
	@Column(name="NAME")
	private String name;
	@Column(name="ADDRESS")
	private String address;
	@Column(name="GUARDIAN")
	private String guardian;
	@Column(name="MOBILE")
	private String mobile;
	@Column(name="CONTACT")
	private String contact;
	@Column(name="EMAIL")
	private String email;
	@Column(name="AADHAR")
	private String aadhar;
	@Column(name="PAN")
	private String pan;
	@Column(name="SALARY")
	private double salary;
	@Column(name="DOJ")
	private Date doj;
	@Column(name="DOR")
	private Date dor;
	//Termination T, Resignation R
	@Column(name="TID")
	private boolean status;
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGuardian() {
		return guardian;
	}
	public void setGuardian(String guardian) {
		this.guardian = guardian;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getDor() {
		return dor;
	}
	public void setDor(Date dor) {
		this.dor = dor;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", name=" + name + ", address=" + address + ", guardian=" + guardian
				+ ", mobile=" + mobile + ", contact=" + contact + ", email=" + email + ", aadhar=" + aadhar + ", pan="
				+ pan + ", salary=" + salary + ", doj=" + doj + ", dor=" + dor + ", status=" + status + "]";
	}
	
}
