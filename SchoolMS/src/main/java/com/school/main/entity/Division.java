package com.school.main.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// TODO: Auto-generated Javadoc
/**
 * The Class Division.
 */
@Entity
@Table(name="DIVISION")
public class Division {

	/** The division. */
	@Id
	@Column(name="DIVISION")
	private String division;
	
	/** The class division. */
	@OneToMany(mappedBy="division")
	private List<ClassDivision> classDivision;

	/**
	 * Gets the division.
	 *
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}
	
	/**
	 * Sets the division.
	 *
	 * @param division the new division
	 */
	public void setDivision(String division) {
		this.division = division;
	}
	
	/**
	 * Gets the class division.
	 *
	 * @return the class division
	 */
	public List<ClassDivision> getClassDivision() {
		return classDivision;
	}

	/**
	 * Sets the class division.
	 *
	 * @param classDivision the new class division
	 */
	public void setClassDivision(List<ClassDivision> classDivision) {
		this.classDivision = classDivision;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Division [division=" + division + "]";
	}
	
}
