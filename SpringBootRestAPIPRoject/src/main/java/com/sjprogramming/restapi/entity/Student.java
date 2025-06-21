package com.sjprogramming.restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	@Column
	private String name;
	@Column
	private float percent;
	@Column
	private String branch;
	
	
	
	public Student() {							//Default Constructor
		super();
	}
	public Student(String name, float percent, String branch) {		
		super();								//Parameterized Constructor
		this.name = name;
		this.percent = percent;
		this.branch = branch;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percent=" + percent + ", branch=" + branch + "]";
	}
	
	
	
}
