package com.barbeit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_lesson")
public class Lesson {

	@Id
	@GeneratedValue
	@Column(name="lesson_id", nullable=false)
	private long id;
	
	@Column(name="lessonname", nullable=false)
	private String name;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="practical_id", nullable=false)
	private Practical practical;
	
	public Lesson(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Practical getPractical() {
		return practical;
	}

	public void setPractical(Practical practical) {
		this.practical = practical;
	}
	
}
