package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table
public class GarageServices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String serviceName;
	
	private String serviceDescription;
	
	private int price;
	
	public GarageServices(String serviceName, String serviceDescription, int price) {
		super();
		this.serviceName = serviceName;
		this.serviceDescription = serviceDescription;
		this.price = price;
	}

	public GarageServices() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceDescription() {
		return serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
