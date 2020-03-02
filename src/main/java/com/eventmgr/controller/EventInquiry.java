package com.eventmgr.controller;

import org.bson.Document;
import org.springframework.stereotype.Controller;

import com.eventmgr.model.Event;
import com.eventmgr.model.Inquiries;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Controller
public class EventInquiry {
	public void createInquiry(Inquiries inq) {
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	    
	     MongoCredential credential; 
	     credential = MongoCredential.createCredential("EventManagement",      "eventManagementDb", 
	    "password".toCharArray()); 
	     System.out.println("Connected to the database successfully");  
	     MongoDatabase database = mongo.getDatabase("eventManagementDb");
	     MongoCollection<Document> collection =      database.getCollection("eventInquiryCollection"); 
	     System.out.println("Collection examplesCollection selected successfully");
	     
	     Document document = new Document("ename", inq.getEname()) 
	     .append("inquiry",inq.getInquiry()); 
	     collection.insertOne(document); 
	     System.out.println("Document inserted successfully"); 
	   } 

}
