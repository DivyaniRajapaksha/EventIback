package com.eventmgr.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Event")
public class Event {

	
	private String id;
	private String cusId;
	private String ename;
	private String elocation;
	private String etype;
	private String ephoneNo;
	private String edate;
	private float etime;
	private String estatus="request";
	


	
	public String getId() {
		return id;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getElocation() {
		return elocation;
	}
	public void setElocation(String elocation) {
		this.elocation = elocation;
	}
	public String getEtype() {
		return etype;
	}
	public void setEtype(String etype) {
		this.etype = etype;
	}
	public String getEphoneNo() {
		return ephoneNo;
	}
	public void setEphoneNo(String ephoneNo) {
		this.ephoneNo = ephoneNo;
	}
	
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public float getEtime() {
		return etime;
	}
	public void setEtime(float etime) {
		this.etime = etime;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
}
