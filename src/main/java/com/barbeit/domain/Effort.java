package com.barbeit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_effort")
public class Effort {
	
	@Id
	@GeneratedValue
	@Column(name="effort_id", nullable=false)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="lesson_id")
	private Lesson lesson;
	
	@ManyToOne
	@JoinColumn(name="advisor_id")
	private Advisor acceptor;
	
	@ManyToOne
	@JoinColumn(name="student_id", nullable=false)
	private Student student;
	
	@Enumerated(EnumType.STRING)
	@Column(name="success", nullable=false)
	private Success success;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="trial")
	private int trial;
	
	public Effort(){
		
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}

	public Advisor getAcceptor() {
		return acceptor;
	}

	public void setAcceptor(Advisor acceptor) {
		this.acceptor = acceptor;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Success getSuccess() {
		return success;
	}

	public void setSuccess(Success success) {
		this.success = success;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getTrial() {
		return trial;
	}

	public void setTrial(int trial) {
		this.trial = trial;
	}

	
}
