package com.wow.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	private int tid;
	private String name;
	private String address;
	private String huspare;
	private String mobile;
	private String contact;
	private String email;
	private String aadhar;
	private double salary;
	private String doj;
	private String dor;
	//Termination T, Resignation R
	private String status;
	
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
	public String getHuspare() {
		return huspare;
	}
	public void setHuspare(String huspare) {
		this.huspare = huspare;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getDor() {
		return dor;
	}
	public void setDor(String dor) {
		this.dor = dor;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", name=" + name + ", address=" + address + ", huspare=" + huspare + ", mobile="
				+ mobile + ", contact=" + contact + ", email=" + email + ", aadhar=" + aadhar + ", salary=" + salary
				+ ", doj=" + doj + ", dor=" + dor + ", status=" + status + "]";
	}
	

}
