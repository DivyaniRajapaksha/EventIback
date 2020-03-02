package com.eventmgr.model;



public class CustomerPayment {
	
	
	private String id;
	private String customerName;
	private String eventName;
	private Double customerPrice;
	private String paymentType;
	private Double customerDiscount;
	private Double customerTotalPrice ;
	private String states;
	private String type;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getStates() {
		return states;
	}
	public void setStates(String states) {
		this.states = states;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public Double getCustomerPrice() {
		return customerPrice;
	}
	public void setCustomerPrice(Double customerPrice) {
		this.customerPrice = customerPrice;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public Double getCustomerDiscount() {
		return customerDiscount;
	}
	public void setCustomerDiscount(Double customerDiscount) {
		this.customerDiscount = customerDiscount;
	}
	public Double getCustomerTotalPrice() {
		return customerTotalPrice;
	}
	public void setCustomerTotalPrice(Double customerTotalPrice) {
		this.customerTotalPrice = customerTotalPrice;
	}
	
	
	
	
	

}
