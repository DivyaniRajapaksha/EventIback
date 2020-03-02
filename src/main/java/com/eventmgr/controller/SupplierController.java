package com.eventmgr.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.bson.Document;
import org.springframework.stereotype.Controller;

import com.eventmgr.model.Event;
import com.eventmgr.model.Supplier;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Controller
public class SupplierController {
	
	public void createSupplier(Supplier supplier) {
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	    
	     MongoCredential credential; 
	     credential = MongoCredential.createCredential("EventManagement",      "eventManagementDb", 
	    "password".toCharArray()); 
	     System.out.println("Connected to the database successfully"); 
	     MongoDatabase database = mongo.getDatabase("eventManagementDb");
	     MongoCollection<Document> collection =      database.getCollection("supplierCollection"); 
	     System.out.println("Collection examplesCollection selected successfully");
	     Document document = new Document("companyName", supplier.getCompanyName())
	     .append("passwordS", supplier.getPassword())	 
	     .append("compWebsite", supplier.getWebsite())
	     .append("compAddress",supplier.getAddress()) 
	     .append("compPhneNo",supplier.getCompanyPhneNo()) 
	     .append("email",supplier.getEmail());
	     collection.insertOne(document); 
	     System.out.println("Document inserted successfully"); 
	   } 
	

	public List<Supplier> getAllSupplier() {
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
		   ArrayList<Supplier> sclst = new ArrayList<Supplier>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
		   System.out.println(txt); 
		   Gson g = new Gson();
		  // String tt="{_id=5d689d48eed0221aac329a6b/ename=divya/elocation=wariyapola/etype=Birthday Parties/ephoneNo=0718505103/edate=2019-08-28, etime=10.0, estatus=request}";
		   Supplier s = g.fromJson(txt, Supplier.class);
		   System.err.println(s.getCompanyName());
		   sclst.add(s);
		   i++; 
		   }
		   for(Supplier s:sclst){
			   System.err.println("yyyyy"+s.getAddress());
		   }
		return sclst;
		 }

}
