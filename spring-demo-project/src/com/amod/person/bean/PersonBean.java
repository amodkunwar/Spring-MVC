package com.amod.person.bean;

import java.io.Serializable;

public class PersonBean implements Serializable {

	private String pName;
	private double pAge;
	private boolean isVeg;
	private String address;

	public PersonBean() {
		System.out.println(this.getClass().getSimpleName() + " class object is created");
	}

	public PersonBean(String address) {
		this.address = address;
		System.out.println(this.getClass().getSimpleName() + " parameterized constructor class object is created");
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpAge() {
		return pAge;
	}

	public void setpAge(double pAge) {
		this.pAge = pAge;
	}

	public boolean getIsVeg() {
		return isVeg;
	}

	public void setIsVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void breadth() {
		System.out.println("All living beings used to breadth");
	}

}
