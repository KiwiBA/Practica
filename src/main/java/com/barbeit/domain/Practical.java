package com.barbeit.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_practical")
public class Practical {

	@Id
	@GeneratedValue
	@Column(name="practical_id", nullable=false)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="subject_id", nullable=false)
	private Subject subject;
	
	@Column(name="semester", nullable=false)
	private String semester;
	
	@ManyToMany
	@JoinTable(name= "tbl_practical_advisor", joinColumns= { @JoinColumn(name="practical_id")}, inverseJoinColumns = {@JoinColumn(name="advisor_id")})
	private Set<Advisor> advisors = new HashSet<Advisor>();
	
//	@Column(name="numberofgroups")
//	private int numberOfGroups;
//	
//	@Column(name="teamspergroup")
//	private int teamsPerGroup;
//	
//	@Column(name="teamsize")
//	private int teamSize;
//	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name= "tbl_practical_group", joinColumns= { @JoinColumn(name="practical_id")}, inverseJoinColumns = {@JoinColumn(name="group_id")})
	private Set<Group> groups = new HashSet<Group>();
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name= "tbl_practical_lesson", joinColumns= { @JoinColumn(name="practical_id")}, inverseJoinColumns = {@JoinColumn(name="lesson_id")})
	private Set<Lesson> lessons = new HashSet<Lesson>();
	
	public Practical(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Set<Advisor> getAdvisors() {
		return advisors;
	}

	public void setAdvisors(Set<Advisor> advisors) {
		this.advisors = advisors;
	}

//	public int getNumberOfGroups() {
//		return numberOfGroups;
//	}
//
//	public void setNumberOfGroups(int numberOfGroups) {
//		this.numberOfGroups = numberOfGroups;
//	}
//
//	public int getTeamsPerGroup() {
//		return teamsPerGroup;
//	}
//
//	public void setTeamsPerGroup(int teamsPerGroup) {
//		this.teamsPerGroup = teamsPerGroup;
//	}
//
//	public int getTeamSize() {
//		return teamSize;
//	}
//
//	public void setTeamSize(int teamSize) {
//		this.teamSize = teamSize;
//	}

	public Set<Group> getGroups() {
		return groups;
	}

	public void setGroups(Set<Group> groups) {
		this.groups = groups;
	}

	public Set<Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(Set<Lesson> lessons) {
		this.lessons = lessons;
	}
	
}
