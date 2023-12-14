package com.example.demo.payload.request;

public class NewServiceRequest {
	String serviceName;
	String ServiceDescription;
	int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceDescription() {
		return ServiceDescription;
	}
	public void setServiceDescription(String serviceDescription) {
		ServiceDescription = serviceDescription;
	}
	
}
