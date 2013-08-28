package com.barbeit.domain;

import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@ManagedBean
@SessionScoped
@Entity
@Table(name="tbl_subject")
public class Subject {
	
	@Id
	@GeneratedValue
	@Column(name="subject_id", nullable=false)
	private long id;
	
	@Column(name="subjectName", nullable=false)
	private String subjectName;
	
	@Column(name="studyCourse")
	private String studyCourse;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@Column(name="practica")
//	private Set<Practical> practica;
	
	public Subject(){
	}
	
	public Subject(String name, String course){
		this.subjectName = name;
		this.studyCourse = course;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
	public String getStudyCourse() {
		return studyCourse;
	}
	public void setStudyCourse(String studyCourse) {
		this.studyCourse = studyCourse;
	}
	
	

}
