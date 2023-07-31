package com.liferay.web.portlet.util;

public class Hosting {
	private long id;
	private String name;
	private double roomPrice;
	private double servicesTotalPrice;
	
	public Hosting() {
		super();
	}

	public Hosting(long id, String name, double roomPrice, double servicesTotalPrice) {
		this.id = id;
		this.name = name;
		this.roomPrice = roomPrice;
		this.servicesTotalPrice = servicesTotalPrice;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public double getServicesTotalPrice() {
		return servicesTotalPrice;
	}

	public void setServicesTotalPrice(double servicesTotalPrice) {
		this.servicesTotalPrice = servicesTotalPrice;
	}

	@Override
	public String toString() {
		return "Hosting \n\tid=" + id + "\n\tname=" + name + "\n\troomPrice=" + roomPrice + "\n\tservicesTotalPrice="
				+ servicesTotalPrice;
	}	
}
