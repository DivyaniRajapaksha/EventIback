package com.eventmgr.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Controller;

import com.eventmgr.model.CustomerPayment;
import com.eventmgr.model.Event;
import com.eventmgr.model.SupplierPayment;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

@Controller

public class SupplierPaymentController {
	
	public void createSupplierPayment(SupplierPayment supplierPayment) {
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	    
	     MongoCredential credential; 
	     credential = MongoCredential.createCredential("EventManagement",      "eventManagementDb", 
	    "password".toCharArray()); 
	     System.out.println("Connected to the database successfully"); 
	     MongoDatabase database = mongo.getDatabase("eventManagementDb");
	     MongoCollection<Document> collection =      database.getCollection("supplierPaymentCollection"); 
	     System.out.println("Collection examplesCollection selected successfully");
	     Document document = new Document("supplierName", supplierPayment.getSupplierName()) 
	     .append("supplierService", supplierPayment.getSupplierService())
	     .append("supplierPrice",supplierPayment.getSupplierPrice())
	     .append("supplierDiscount",supplierPayment.getSupplierDiscount())
	     .append("states","Pending")
	     .append("type","Customer")
	     .append("supplierDate",supplierPayment.getSupplierDate()) ;
	     
	     	     collection.insertOne(document); 
	     System.out.println("Document inserted successfully"); 
	   } 
	
	
	
	public List<SupplierPayment> getAllSupplierPayments() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("supplierCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   FindIterable<Document> iterDoc = collection.find(); 
		   int i = 1;
		   ArrayList< SupplierPayment> evlst = new ArrayList< SupplierPayment>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
		   System.out.println(txt); 
		   Gson g = new Gson();
		  // String tt="{_id=5d689d48eed0221aac329a6b/ename=divya/elocation=wariyapola/etype=Birthday Parties/ephoneNo=0718505103/edate=2019-08-28, etime=10.0, estatus=request}";
		   SupplierPayment p = g.fromJson(txt,  SupplierPayment.class);
//		   System.err.println(p.getfName());
		   evlst.add(p);
		   i++; 
		   }
		   for( SupplierPayment p:evlst){
			   System.err.println("yyyyy"+p.getSupplierName());
		   }
		return evlst;
		 }
	 public void deleteSupplierPayment(String sname) {
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
	     	
			MongoCredential credential; 
			   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
					   "password".toCharArray()); 
			System.out.println("Connected to the database successfully");
	    
			MongoDatabase database = mongo.getDatabase("eventManagementDb");
	    	
			MongoCollection<Document> collection =       database.getCollection("supplierPaymentCollection");
			System.out.println("Collection examplesCollection selected successfully");
				 
			System.out.println(sname);
		
			String abc=sname;
			collection.deleteOne(Filters.eq("supplierPaymentCollection",sname)); 
			System.out.println("Document deleted successfully..."); 
			
		}
		

	public List<SupplierPayment> getPendingSupplierPayment() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("supplierCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   System.out.println("BBBBBBBBBBBBBBBB");
		   
		   FindIterable<Document> iterDoc = collection.find(Filters.eq("states", "pending")); 
		   int i = 1;
		   ArrayList<SupplierPayment> evlst = new ArrayList<SupplierPayment>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
			   txt= txt.replace("_id", "id");
		   Gson g = new Gson();
		   SupplierPayment p = g.fromJson(txt, SupplierPayment.class);
		   evlst.add(p);
		   i++; 
		   }
		return evlst;
		 }
	 
	
	
	
	
	  
	
	
	
	
	public void updateSupplierPayment(SupplierPayment supplierPayment) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("supplierPaymentCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   //collection.updateOne(Filters.eq("supplierName", supplierName), Updates.set("supplierName", supplierPayment.getSupplierName()));
		   //collection.updateOne(Filters.eq("supplierName", supplierName), Updates.set(" supplierPayment", supplierPayment.getSupplierService()));
		   //collection.updateOne(Filters.eq("supplierName", supplierName), Updates.set("supplierPrice",supplierPayment.getSupplierPrice()));
		   //collection.updateOne(Filters.eq("supplierName", supplierName), Updates.set("supplierDate",supplierPayment.getSupplierDate()));
		   //collection.updateOne(Filters.eq("supplierName", supplierName), Updates.set("supplierDiscount",supplierPayment.getSupplierDiscount()));
		  
			 
			System.out.println("Collection examplesCollection updated successfully");
	
}
	
	public void viewSupplierPayment(SupplierPayment supplierPayment) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("supplierPaymentCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   //collection.viewOne(Filters.eq("supplierName", supplierName), Views.set("supplierName", supplierPayment.getSupplierName()));
		   //collection.viewOne(Filters.eq("supplierName", supplierName), Views.set(" supplierPayment", supplierPayment.getSupplierService()));
		   //collection.viewOne(Filters.eq("supplierName", supplierName), Views.set("supplierPrice",supplierPayment.getSupplierPrice()));
		   //collection.viewOne(Filters.eq("supplierName", supplierName), Views.set("supplierDate",supplierPayment.getSupplierDate()));
		   //collection.viewOne(Filters.eq("supplierName", supplierName), Views.set("supplierDiscount",supplierPayment.getSupplierDiscount()));
		  
			 
			System.out.println("Collection examplesCollection view successfully");
	
}
	
}