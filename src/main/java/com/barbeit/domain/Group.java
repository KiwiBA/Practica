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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_group")
public class Group {

	@Id
	@GeneratedValue
	@Column(name="group_id", nullable=false)
	private long id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name= "tbl_group_team", joinColumns= { @JoinColumn(name="group_id")}, inverseJoinColumns = {@JoinColumn(name="team_id")})
	private Set<Team> teams =new HashSet<Team>();
	
	@Column(name="room")
	private String room;
	
	@Column(name="day")
	private String day;
	
	@Column(name="time")
	private String time;
	
	public Group(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<Team> getTeams() {
		return teams;
	}

	public void setTeams(Set<Team> teams) {
		this.teams = teams;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
