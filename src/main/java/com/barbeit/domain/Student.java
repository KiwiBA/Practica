package com.barbeit.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="student_id", nullable=false)
	private long id;
	
	@OneToOne
	@JoinColumn(name="rzperson_id", nullable=false)
	private RZPerson rzPerson;
	
	@Embedded
	@AttributeOverrides({ //eigentlich nicht nötig?
		@AttributeOverride(name="graduation", column = @Column(name="stud_graduation")),
		@AttributeOverride(name="education", column = @Column(name="stud_education")),
		@AttributeOverride(name="prevstudycourse", column = @Column(name="stud_prevstudycourse"))
	}	)
	private Knowledge knowledge;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tbl_student_effort", joinColumns= { @JoinColumn(name="student_id")}, inverseJoinColumns = {@JoinColumn(name="effort_id")})
	private Set<Effort> efforts = new HashSet<Effort>();
	
	@Column(name="studycourse")
	private String studyCourse;
	
	@Column(name="semester")
	private String semesterCount;
	
	public Student(){
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public RZPerson getRzPerson() {
		return rzPerson;
	}

	public void setRzPerson(RZPerson rzPerson) {
		this.rzPerson = rzPerson;
	}

	
	public Knowledge getKnowledge() {
		return knowledge;
	}

	public void setKnowledge(Knowledge knowledge) {
		this.knowledge = knowledge;
	}

	public Set<Effort> getEfforts() {
		return efforts;
	}

	public void setEfforts(Set<Effort> efforts) {
		this.efforts = efforts;
	}

	
	public String getStudyCourse() {
		return studyCourse;
	}

	public void setStudyCourse(String studyCourse) {
		this.studyCourse = studyCourse;
	}

	
	public String getSemesterCount() {
		return semesterCount;
	}

	public void setSemesterCount(String semesterCount) {
		this.semesterCount = semesterCount;
	}


	

}
