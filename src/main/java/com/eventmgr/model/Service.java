package com.eventmgr.model;

public class Service {
	private String serviceId;
	private String serviceName;
	
	
	
	
	public Service(String serviceName) {
		super();
		this.serviceName = serviceName;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}


	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
}
