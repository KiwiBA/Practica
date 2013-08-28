package com.barbeit.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.PROPERTY)
public class Knowledge {

	@Column(name="graduation")
	private String graduation;
	
	@Column(name="education")
	private String education;
	
	@Column(name="prevstudycourse")
	private String previousStudyCourse;
	
	public Knowledge(){
		
	}
	
	public String getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}
	
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getPreviousStudyCourse() {
		return previousStudyCourse;
	}
	public void setPreviousStudyCourse(String previousStudyCourse) {
		this.previousStudyCourse = previousStudyCourse;
	}
	
}
