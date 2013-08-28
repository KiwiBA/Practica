package com.barbeit.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_rzperson")
public class RZPerson {

	@Id
	@GeneratedValue
	@Column(name="rzperson_id", nullable=false)
	private long id;
	
	@Column(name="rzname", nullable=false)
	private String rzName;
	
	@Column(name="matnumber")
	private int matNumber;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="firstname", nullable=false)
	private String firstName;
	
	public RZPerson(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRzName() {
		return rzName;
	}

	public void setRzName(String rzName) {
		this.rzName = rzName;
	}

	public int getMatNumber() {
		return matNumber;
	}

	public void setMatNumber(int matNumber) {
		this.matNumber = matNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
