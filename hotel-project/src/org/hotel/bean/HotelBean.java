package org.hotel.bean;

import java.io.Serializable;

public class HotelBean implements Serializable {

	private String hotelName;
	private String location;
	private double rating;
	private boolean isVeg;
	private int noOfBranches;

	public HotelBean() {
		System.out.println(this.getClass().getSimpleName() + " 0 prarametrised class object is created");
	}

	public HotelBean(String name, String location, double rating) {
		this.hotelName = name;
		this.location = location;
		this.rating = rating;
		System.out.println(this.getClass().getSimpleName() + " 5 prarametrised class object is created");
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public boolean getIsVeg() { // getIsVeg
		return isVeg;
	}

	public void setIsVeg(boolean isVeg) { // setIsVeg
		this.isVeg = isVeg;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	public void eating() {
		System.out.println("Eating....");
	}

}
