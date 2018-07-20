package com.wow.main.model;

import javax.persistence.Embeddable;

@Embeddable
public class Class_Division {

	private String cname;
	private String division;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	
}
