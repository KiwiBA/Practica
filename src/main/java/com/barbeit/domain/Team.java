package com.barbeit.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_team")
public class Team {

	@Id
	@GeneratedValue
	@Column(name="team_id", nullable=false)
	private long id;
	
	//private int teamNumber; //usefull??
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tbl_team_student", joinColumns = { @JoinColumn(name="team_id")}, inverseJoinColumns = {@JoinColumn(name="student_id")})
	private Set<Student> student = new HashSet<Student>();
	
	@Column(name="maxStudents", nullable=false)
	private int maxStudents;

	public Team() {
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}


	public int getMaxStudents() {
		return maxStudents;
	}


	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}
	
}
