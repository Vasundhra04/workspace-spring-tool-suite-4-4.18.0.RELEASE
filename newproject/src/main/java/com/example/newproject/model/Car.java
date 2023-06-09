package com.example.newproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Car {
	
	@Id
	@GeneratedValue
	@Column(name="Model")
	private String Model;
	
public String getModel() {
		
		return Model;
	}
	public void setModel(String model) {
		
		Model= model;
	}
		
	public Car() {
		super();
	}
//	public Car(String model, String engine, String fueltype, String transmission, String mileage, String price,
		//	String review, String maxpow, String sc, String bs) {
		//super();
		//Model = model;
	//	Engine = engine;
	//	Fueltype = fueltype;
		//Transmission = transmission;
	//	Mileage = mileage;
	//	Price = price;
		//Review = review;
	//	Maxpow = maxpow;
	//	Sc = sc;
		//Bs = bs;
	//}
	@Column(name="Engine")
	private String Engine;
	@Column(name="Fueltype")
	private String Fueltype;
	@Column(name="Transmission")
	private String Transmission;
	@Column(name="Mileage")
	private String Mileage;
	@Column(name="Price")
	private String Price;
	@Column(name="Review")
	private String Review;
	@Column(name="Maxpow")
	private String Maxpow;
	@Column(name="Sc")
	private String Sc;
	@Column(name="Bs")
	private String Bs;
	

	public String getEngine() {
		return Engine;
	}
	public void setEngine(String engine) {
		Engine = engine;
	}
	public String getFueltype() {
		return Fueltype;
	}
	public void setFueltype(String fueltype) {
		Fueltype = fueltype;
	}
	public String getTransmission() {
		return Transmission;
	}
	public void setTransmission(String transmission) {
		Transmission = transmission;
	}
	public String getMileage() {
		return Mileage;
	}
	public void setMileage(String mileage) {
		Mileage = mileage;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	public String getReview() {
		return Review;
	}
	public void setReview(String review) {
		Review = review;
	}
	public String getMaxpow() {
		return Maxpow;
	}
	public void setMaxpow(String maxpow) {
		Maxpow = maxpow;
	}
	public String getSc() {
		return Sc;
	}
	public void setSc(String sc) {
		Sc = sc;
	}
	public String getBs() {
		return Bs;
	}
	public void setBs(String bs) {
		Bs = bs;
	}
	
	
	@Override
	public String toString() {
		return "Car [Model=" + Model + ", Engine=" + Engine + ", Fueltype=" + Fueltype + ", Transmission="
				+ Transmission + ", Mileage=" + Mileage + ", Price=" + Price + ", Review=" + Review + ", Maxpow="
				+ Maxpow + ", Sc=" + Sc + ", Bs=" + Bs + "]";
	}

}
