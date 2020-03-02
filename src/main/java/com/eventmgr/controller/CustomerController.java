package com.eventmgr.controller;





import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.stereotype.Controller;


import com.eventmgr.model.Customer;
import com.eventmgr.model.Event;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.CountOptions;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import ch.qos.logback.core.filter.Filter;

@Controller
public class CustomerController {
	
	public void createCustomer(Customer customer) {
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	    
	     MongoCredential credential; 
	     credential = MongoCredential.createCredential("EventManagement",      "eventManagementDb", 
	    "password".toCharArray()); 
	     System.out.println("Connected to the database successfully"); 
	     MongoDatabase database = mongo.getDatabase("eventManagementDb");
	     MongoCollection<Document> collection =      database.getCollection("customerCollection"); 
	     System.out.println("Collection examplesCollection selected successfully");
	     Document document = new Document("email", customer.getEmail()) 
	     .append("nic", customer.getNic())
	     .append("fName",customer.getfName())
	     .append("lName",customer.getlName())
	     .append("address",customer.getAddress()) 
	     .append("phneNo",customer.getPhneNo())
	     .append("username",customer.getUsername())
	     .append("password",customer.getPassword())
	     .append("company","No Company Specified")
	     .append("post","No Position Specified");
	     collection.insertOne(document);
	     
	     System.out.println("Document inserted successfully"); 
	   }
	
	public float countPendCusEvent(HttpServletRequest request) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   String nic =(String)request.getSession().getAttribute("nic");
		   
		   
		   Bson filter1 = Filters.eq("estatus","pending");
		   Bson filter2 = Filters.eq("cusId",nic);
		   Bson filter3 = Filters.and(filter1,filter2);
		   
		   

		   float a=collection.count(Filters.eq(filter3));
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}
	
	public float countTotCusEvent(HttpServletRequest request) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   String nic =(String)request.getSession().getAttribute("nic");
		   
		   System.out.println("-----------------------------------------------------------------------------NIC Of Tot Cus Events : "+nic);

		    float a=collection.count(Filters.eq("cusId", nic));
		    System.out.println("pending cus Count is"+a);
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}
	
	
	
	public float countConCusEvent(HttpServletRequest request) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("eventCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   String nic =(String)request.getSession().getAttribute("nic");
		   
		   Bson filter1 = Filters.eq("estatus","confirm");
		   Bson filter2 = Filters.eq("cusId",nic);
		   Bson filter3 = Filters.and(filter1,filter2);
		   
		   

		   float a=collection.count(Filters.eq(filter3));
		   
		   
		   System.out.println("-----------------------------------------------------------------------------NIC Of Tot Cus Con Events : "+nic);

		    System.out.println("pending cus Con Count is"+a);
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}
	
	
	
	public void updateCustomer(Customer cust,String nic) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("customerCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("nic",cust.getNic()));
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("email",cust.getEmail()));
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("fName",cust.getfName()));
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("lName",cust.getlName()));
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("address",cust.getAddress()));
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("phneNo",cust.getPhneNo()));
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("username",cust.getUsername()));
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("password",cust.getPassword()));
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("company",cust.getCompany()));
		   collection.updateOne(Filters.eq("nic", nic), Updates.set("post",cust.getPost()));
			  
			System.out.println("Collection examplesCollection updated successfully");
	}
	
	public float countAllCustomer() {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("customerCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		    float a=collection.count();
		    System.out.println("Count is"+a);
		   
			System.out.println("Collection examplesCollection Request Collections Number successfully");
			return a;
	}
	
	
	
	public List<Customer> getAllCustomer() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("customerCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   FindIterable<Document> iterDoc = collection.find(); 
		   int i = 1;
		   ArrayList< Customer> evlst = new ArrayList< Customer>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
		   System.out.println(txt); 
		   Gson g = new Gson();
		  // String tt="{_id=5d689d48eed0221aac329a6b/ename=divya/elocation=wariyapola/etype=Birthday Parties/ephoneNo=0718505103/edate=2019-08-28, etime=10.0, estatus=request}";
		   Customer p = g.fromJson(txt, Customer.class);
		   System.err.println(p.getfName());
		   evlst.add(p);
		   i++; 
		   }
		   for(Customer p:evlst){
			   System.err.println("yyyyy"+p.getAddress());
		   }
		return evlst;
		 }
	
	public Customer getCustomerDetails(String nic) {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("customerCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   FindIterable<Document> iterDoc = collection.find(Filters.eq("nic", nic)); 
		   int i = 1;
		   Customer p=new Customer();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		  
		    p = g.fromJson(txt, Customer.class);
		  
		   }
		    
		   return p;
		 
		 }
	
	
	public void deleteCustomer(String nic) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
     	
		MongoCredential credential; 
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
				   "password".toCharArray()); 
		System.out.println("Connected to the database successfully");
    
		MongoDatabase database = mongo.getDatabase("eventManagementDb");
    	
		MongoCollection<Document> collection =       database.getCollection("customerCollection");
		System.out.println("Collection examplesCollection selected successfully");
			 
		System.out.println(nic);
	
		String abc=nic;
		collection.deleteOne(Filters.eq("nic",nic)); 
		System.out.println("Document deleted successfully..."); 
		
	}
	public boolean validate(String nic,String Password) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
     	
		MongoCredential credential; 
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
				   "password".toCharArray()); 
		System.out.println("Connected to the database successfully");
    
		MongoDatabase database = mongo.getDatabase("eventManagementDb");
    	
		MongoCollection<Document> collection =       database.getCollection("customerCollection");
		System.out.println("Collection examplesCollection selected successfully");
			 
		System.out.println(nic);
	
		String conp;
		
		 FindIterable<Document> iterDoc = collection.find(Filters.eq("nic", nic)); 
		   int i = 1;
		   Customer p=new Customer();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		  
		    p = g.fromJson(txt, Customer.class);
		  
		   }
		  
		   conp=p.getPassword();
		   
		   if(Password.equals(conp)) {
			   return true;
		   }
		   
		   else {
			   
			   return false;
		   }
		 
		
	}
	
	
}
