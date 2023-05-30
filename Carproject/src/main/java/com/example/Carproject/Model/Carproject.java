package com.example.Carproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Carproject {

	   @Id
	   private int id;
	   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMaxpower() {
		return maxpower;
	}
	public void setMaxpower(String maxpower) {
		this.maxpower = maxpower;
	}
	public String getSeating() {
		return seating;
	}
	public void setSeating(String seating) {
		this.seating = seating;
	}
	public String getBootspace() {
		return bootspace;
	}
	public void setBootspace(String bootspace) {
		this.bootspace = bootspace;
	}
	private String carmodel;
	   private String engine;
	   private String fuel;
	  
	   private String mileage;
	   private String price;
	   private String maxpower;
	   private String seating;
	   private String bootspace;
	   
	   
}


