package com.wow.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	
	@Id
	private int eid;
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
	private double hra;
	private double pf;
	private double medical;
	private double allowance;
	//Termination T, Resignation R
	private boolean status;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getMedical() {
		return medical;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Teacher [eid=" + eid + ", name=" + name + ", address=" + address + ", huspare=" + huspare + ", mobile="
				+ mobile + ", contact=" + contact + ", email=" + email + ", aadhar=" + aadhar + ", salary=" + salary
				+ ", doj=" + doj + ", dor=" + dor + ", hra=" + hra + ", pf=" + pf + ", medical=" + medical
				+ ", allowance=" + allowance + ", status=" + status + "]";
	}
	
	
}
