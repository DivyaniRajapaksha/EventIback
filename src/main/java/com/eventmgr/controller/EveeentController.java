package com.eventmgr.controller;

import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.geo.GeoJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.mongodb.core.MongoOperations;

import com.eventmgr.model.Customer;
//import com.google.gson.Gson;
import com.eventmgr.model.Event;
import com.eventmgr.model.Inquiries;
import com.eventmgr.repositaries.EventRepositary;
import com.google.gson.Gson;
//import com.fasterxml.jackson.databind.util.JSONPObject;
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import org.bson.Document;

import java.util.ArrayList;
import java.util.Iterator;
//import org.apache.tomcat.util.json.JSONParser;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient; 
import com.mongodb.MongoCredential;

/*import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;*/

import com.mongodb.client.FindIterable; 

@Controller
public class EveeentController {
	
	public void createEvent(Event event) {
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	    
	     MongoCredential credential; 
	     credential = MongoCredential.createCredential("EventManagement",      "eventManagementDb", 
	    "password".toCharArray()); 
	     System.out.println("Connected to the database successfully");  
	     MongoDatabase database = mongo.getDatabase("eventManagementDb");
	     MongoCollection<Document> collection =      database.getCollection("eventCollection"); 
	     System.out.println("Collection examplesCollection selected successfully");
	     Document document = new Document("ename", event.getEname()) 
	     .append("elocation", event.getElocation())
	     .append("etype",event.getEtype()) 
	     .append("ephoneNo",event.getEphoneNo()) 
	     .append("edate",event.getEdate()) 
	     .append("etime",event.getEtime())
	     .append("cusId",event.getCusId())
	     .append("estatus",event.getEstatus()); 
	     collection.insertOne(document); 
	     System.out.println("Document inserted successfully"); 
	   } 
	
	
	
	public List<Event> getAllEvent() {
	 String str="";
	 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	   MongoCredential credential;
	   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
	   "password".toCharArray()); 
	   System.out.println("Connected to the database successfully");  
	   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
	   MongoCollection<Document> collection =    database.getCollection("eventCollection");
	   System.out.println("Collection examplesCollection selected successfully");
	   FindIterable<Document> iterDoc = collection.find(); 
	   int i = 1;
	   ArrayList<Event> evlst = new ArrayList<Event>();
	   Iterator it = iterDoc.iterator(); 
	   while (it.hasNext()) { 
		   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
		   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
		   txt=txt.replace(",\" ", ",\"");
	   System.out.println(txt); 
	   Gson g = new Gson();
	  // String tt="{_id=5d689d48eed0221aac329a6b/ename=divya/elocation=wariyapola/etype=Birthday Parties/ephoneNo=0718505103/edate=2019-08-28, etime=10.0, estatus=request}";
	   Event p = g.fromJson(txt, Event.class);
	   System.err.println(p.getEname());
	   evlst.add(p);
	   i++; 
	   }
	   for(Event p:evlst){
		   System.err.println("yyyyy"+p.getElocation());
	   }
	return evlst;
	 }

	public void deleteEvent(String ename) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
     	
		MongoCredential credential; 
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
				   "password".toCharArray()); 
		System.out.println("Connected to the database successfully");
    
		MongoDatabase database = mongo.getDatabase("eventManagementDb");
    	
		MongoCollection<Document> collection =       database.getCollection("eventCollection");
		System.out.println("Collection examplesCollection selected successfully");
			 
		System.out.println(ename);
	
		String abc=ename;
		collection.deleteOne(Filters.eq("ename",ename)); 
		System.out.println("Document deleted successfully..."); 
		
	}
	public List<Event> getRequestedEvent() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   
		   FindIterable<Document> iterDoc = collection.find(Filters.eq("estatus", "request")); 
		   int i = 1;
		   ArrayList<Event> evlst = new ArrayList<Event>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		   Event p = g.fromJson(txt, Event.class);
		   evlst.add(p);
		   i++; 
		   }
		return evlst;
		 }
	
	
	public List<Event> getPendingEvent() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   
		   FindIterable<Document> iterDoc = collection.find(Filters.eq("estatus", "pending")); 
		   int i = 1;
		   ArrayList<Event> evlst = new ArrayList<Event>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		   Event p = g.fromJson(txt, Event.class);
		   evlst.add(p);
		   i++; 
		   }
		return evlst;
		 }
	
	
	public List<Event> getConfirmedEvent() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   
		   FindIterable<Document> iterDoc = collection.find(Filters.eq("estatus", "confirm")); 
		   int i = 1;
		   ArrayList<Event> evlst = new ArrayList<Event>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		   Event p = g.fromJson(txt, Event.class);
		   evlst.add(p);
		   i++; 
		   }
		return evlst;
		 }
	
	public Event geteventDetails(String ename) {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   FindIterable<Document> iterDoc = collection.find(Filters.eq("ename", ename)); 
		   int i = 1;
		   Event p=new Event();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		  
		    p = g.fromJson(txt, Event.class);
		  
		   }
		    
		   return p;
		 
		 }
	

	
	public void confirmEvent(String ename) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   
	      collection.updateOne(Filters.eq("ename", ename), Updates.set("estatus","pending")); 
	      System.out.println("Document update successfully..."); 
	      
	      /*FindIterable<Document> iterDoc = collection.find(); 
	      int i = 1;
	      // Getting the iterator 
	      Iterator it = iterDoc.iterator();
	      while (it.hasNext()) { 
	      System.out.println(it.next()); 
	      i++; 
	      } */
	   
	}
	public float countReqEvent() {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		    float a=collection.count(Filters.eq("estatus", "request"));
		    System.out.println("Count is"+a);
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}
	/*public float countIdleCustomer() {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		    collection.distinct("cusId");
		    System.out.println("Count is"+a);
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}*/
	
	public float countPendEvent() {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		    float a=collection.count(Filters.eq("estatus", "pending"));
		    System.out.println("Count is"+a);
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}
	
	public float countConfirmedEvent() {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		    float a=collection.count(Filters.eq("estatus", "confirm"));
		    System.out.println("Count is"+a);
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}
	public float countAllEvent() {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		    float a=collection.count();
		    System.out.println("Count is"+a);
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}
	
	public void updateEvent(Event event,String ename) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   collection.updateOne(Filters.eq("ename", ename), Updates.set("edate",event.getEdate()));
		   collection.updateOne(Filters.eq("ename", ename), Updates.set("elocation",event.getElocation()));
		   collection.updateOne(Filters.eq("ename", ename), Updates.set("etime",event.getEtime()));
		   collection.updateOne(Filters.eq("ename", ename), Updates.set("ephoneNo",event.getEphoneNo()));
			
			 
			System.out.println("Collection examplesCollection updated successfully");
	}
	

	public List<Event> getUpcomingEvent() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		  System.out.println("MYYY");
		   FindIterable<Document> iterDoc = collection.find(Filters.in("edate", "2019-10.23","2019-10.31")) ;
		   int i = 1;
		   ArrayList<Event> evlst = new ArrayList<Event>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		   Event p = g.fromJson(txt, Event.class);
		   evlst.add(p);
		   i++; 
		   }
		return evlst;
		 }
	
	public List<Inquiries> getEventInquiries(String ename) {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventInquiryCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		  System.out.println("MYYY");
		   FindIterable<Document> iterDoc = collection.find(Filters.in("ename",ename)) ;
		   int i = 1;
		   ArrayList<Inquiries> evlst = new ArrayList<Inquiries>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		   Inquiries p = g.fromJson(txt, Inquiries.class);
		   evlst.add(p);
		   i++; 
		   }
		return evlst;
		 }

	public List<Event> getCusEvent(String nic) {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   
		   FindIterable<Document> iterDoc = collection.find(Filters.eq("cusId", nic)); 
		   int i = 1;
		   ArrayList<Event> evlst = new ArrayList<Event>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		   Event p = g.fromJson(txt, Event.class);
		   evlst.add(p);
		   i++; 
		   }
		return evlst;
		 }
	
	
	
}
	
	


