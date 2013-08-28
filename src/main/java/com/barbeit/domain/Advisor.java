package com.barbeit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_advisor")
public class Advisor {

	@Id
	@GeneratedValue
	@Column(name="advisor_id", nullable=false)
	private long id;
	
	@OneToOne
	@JoinColumn(name="rzperson_id", nullable=false)
	private RZPerson rzPerson;
	
	@Column(name="titel")
	private String titel;
	
	
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
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
}
