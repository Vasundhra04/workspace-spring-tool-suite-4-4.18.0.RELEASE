package com.example.Crudproject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crud")
public class Crud {

	 @Id
	    private int regno;
		public Crud(int regno, String name, String dept) {
			super();
			this.regno = regno;
			this.name = name;
			this.dept = dept;
		}
		public Crud() {
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


