package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int regno;
	public Student(int regno, String name, String dept) {
		super();
		this.regno = regno;
		this.name = name;
		this.dept = dept;
	}
	public Student() {
		super();
	}
	private String name;
	private String dept;
	public int getRegno()
	{
		return regno;
	}
	public void setRegno(int regno)
	{
		this.regno=regno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	
}
