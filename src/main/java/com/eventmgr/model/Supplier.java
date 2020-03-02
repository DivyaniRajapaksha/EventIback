package com.eventmgr.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Supplier")
public class Supplier {
	@Id
	private String sId;
	
	private String companyName;
	private String compWebsite;
	private String compAddress;
	private String compPhneNo;
	private String supPassword;
	private String email;

	
	
	
	public Supplier(String sID,String companyName, String compWebsite, String compAddress, String compPhneNo, String supPassword,
			String email) {
		super();
		this.sId = sID;
		this.companyName = companyName;
		this.compWebsite = compWebsite;
		this.compAddress = compAddress;
		this.compPhneNo = compPhneNo;
		this.supPassword = supPassword;
		this.email = email;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebsite() {
		return compWebsite;
	}
	public void setWebsite(String website) {
		this.compWebsite = website;
	}
	public String getAddress() {
		return compAddress;
	}
	public void setAddress(String address) {
		this.compAddress = address;
	}
	public String  getCompanyPhneNo() {
		return compPhneNo;
	}
	public void setCompanyPhneNo(String companyPhneNo) {
		this.compPhneNo = companyPhneNo;
	}
	public String getPassword() {
		return supPassword;
	}
	public void setPassword(String password) {
		this.supPassword = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
	
}
