package com.example.api_test.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "saff")
public class Saff implements Serializable{
	
	@Id
	@Column(name = "SaffCode", nullable = false)
	private int saffCode;
	
	@Column(name = "SaffName", nullable = false)
	private String saffName;
	
	@Column(name = "Position", nullable = false)
	private String position;
	
	@Column(name = "SaffCode", nullable = true)
	private String phoneNumber;
	
	@ManyToMany(mappedBy = "persons")
	private Collection<ProjectTeam> saffList;
	
	@Column(name = "Email", nullable = true)
	private String email;
	
	public Saff(int saffCode, String saffName, String position, String phoneNumber, Collection<ProjectTeam> saffList, String email) {
		super();
		this.saffCode = saffCode;
		this.saffName = saffName;
		this.position = position;
		this.phoneNumber = phoneNumber;
		this.saffList = saffList;
		this.email = email;
	}

	public int getSaffCode() {
		return saffCode;
	}



	public void setSaffCode(int saffCode) {
		this.saffCode = saffCode;
	}

	public String getSaffName() {
		return saffName;
	}

	public void setSaffName(String saffName) {
		this.saffName = saffName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<ProjectTeam> getSaffList() {
		return saffList;
	}

	public void setSaffList(Collection<ProjectTeam> saffList) {
		this.saffList = saffList;
	}
	
}
