package com.eventmgr.controller;

import org.bson.Document;
import org.springframework.stereotype.Controller;


import com.eventmgr.model.Service;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Controller
public class ServiceController {
	
	public void createService(Service service) {
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	    
	     MongoCredential credential; 
	     credential = MongoCredential.createCredential("EventManagement",      "eventManagementDb", 
	    "password".toCharArray()); 
	     System.out.println("Connected to the database successfully"); 
	     MongoDatabase database = mongo.getDatabase("eventManagementDb");
	     MongoCollection<Document> collection =      database.getCollection("serviceCollection"); 
	     System.out.println("Collection examplesCollection selected successfully");
	     Document document = new Document("serviceName",service.getServiceName()); 
	     collection.insertOne(document); 
	     System.out.println("Document inserted successfully"); 
	   } 

}
