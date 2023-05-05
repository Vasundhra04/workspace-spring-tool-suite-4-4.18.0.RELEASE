package com.example.firstproject3.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

@Entity
@Table(name="FamilyDetails")

public class family {
   
	@Id
	@GeneratedValue
	@Column(name="id")
	 private int id;
	public family() {
		super();
	}
	public family(int id, String tbookingfrom, String tbookingto, String tbookingdate, String tbookingclasses,
			String tbookingcompartments) {
		super();
		this.id = id;
		this.tbookingfrom = tbookingfrom;
		this.tbookingto = tbookingto;
		this.tbookingdate = tbookingdate;
		this.tbookingclasses = tbookingclasses;
		this.tbookingcompartments = tbookingcompartments;
	}
	@Override
	public String toString() {
		return "family [id=" + id + ", tbookingfrom=" + tbookingfrom + ", tbookingto=" + tbookingto + ", tbookingdate="
				+ tbookingdate + ", tbookingclasses=" + tbookingclasses + ", tbookingcompartments="
				+ tbookingcompartments + "]";
	}
	public family() {
		super();
	}
	public family(int id, String tbookingfrom, String tbookingto, String tbookingdate, String tbookingclasses,
			String tbookingcompartments) {
		super();
		this.id = id;
		this.tbookingfrom = tbookingfrom;
		this.tbookingto = tbookingto;
		this.tbookingdate = tbookingdate;
		this.tbookingclasses = tbookingclasses;
		this.tbookingcompartments = tbookingcompartments;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTbookingfrom() {
		return tbookingfrom;
	}
	public void setTbookingfrom(String tbookingfrom) {
		this.tbookingfrom = tbookingfrom;
	}
	public String getTbookingto() {
		return tbookingto;
	}
	public void setTbookingto(String tbookingto) {
		this.tbookingto = tbookingto;
	}
	public String getTbookingdate() {
		return tbookingdate;
	}
	public void setTbookingdate(String tbookingdate) {
		this.tbookingdate = tbookingdate;
	}
	public String getTbookingclasses() {
		return tbookingclasses;
	}
	public void setTbookingclasses(String tbookingclasses) {
		this.tbookingclasses = tbookingclasses;
	}
	public String getTbookingcompartments() {
		return tbookingcompartments;
	}
	public void setTbookingcompartments(String tbookingcompartments) {
		this.tbookingcompartments = tbookingcompartments;
	}
	@Column(name="tbookingfrom")
	String tbookingfrom;
	@Column(name="tbookingto")
	String tbookingto;
	@Column(name="tbookingdate")
	String tbookingdate;
	@Column(name="tbookingclasses")
	String tbookingclasses;
	@Column(name="tbookingcompartments")
	String tbookingcompartments;
}
