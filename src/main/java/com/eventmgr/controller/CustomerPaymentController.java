package com.eventmgr.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;
import org.springframework.stereotype.Controller;
import com.eventmgr.model.Customer;
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

public class CustomerPaymentController {
	
	public void createCustomerPayment(CustomerPayment customerPayment) {
		System.out.println("Cust Total Price: " + customerPayment.getCustomerTotalPrice());
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
	    
	     MongoCredential credential; 
	     credential = MongoCredential.createCredential("EventManagement",      "eventManagementDb", 
	    "password".toCharArray()); 
	     System.out.println("Connected to the database successfully"); 
	     MongoDatabase database = mongo.getDatabase("eventManagementDb");
	     MongoCollection<Document> collection =      database.getCollection("customerPaymentCollection"); 
	     System.out.println("Collection examplesCollection selected successfully");
	     Document document = new Document("customerName", customerPayment.getCustomerName()) 
	     .append("eventName", customerPayment.getEventName())
	     .append("customerPrice",customerPayment.getCustomerPrice())
	     .append("paymentType",customerPayment.getPaymentType())
	     .append("customerDiscount",customerPayment.getCustomerDiscount()) 
	     .append("states","Pending")
	     .append("type","Customer")
	     .append(" customerTotalPrice",customerPayment.getCustomerTotalPrice());
	     collection.insertOne(document); 
	     System.out.println("Document inserted successfully"); 
	   } 
	
	
	
	public List<CustomerPayment> getAllCustomerPayments() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("customertCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   FindIterable<Document> iterDoc = collection.find(); 
		   int i = 1;
		   ArrayList< CustomerPayment> evlst = new ArrayList< CustomerPayment>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
		   System.out.println(txt); 
		   Gson g = new Gson();
		  // String tt="{_id=5d689d48eed0221aac329a6b/ename=divya/elocation=wariyapola/etype=Birthday Parties/ephoneNo=0718505103/edate=2019-08-28, etime=10.0, estatus=request}";
		   CustomerPayment p = g.fromJson(txt,  CustomerPayment.class);
//		   System.err.println(p.getfName());
		   evlst.add(p);
		   i++; 
		   }
		   for( CustomerPayment p:evlst){
			   System.err.println("yyyyy"+p.getCustomerName());
		   }
		return evlst;
		 }
	
	public void deleteCustomerPayment(String cname) {
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
     	
		MongoCredential credential; 
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
				   "password".toCharArray()); 
		System.out.println("Connected to the database successfully");
    
		MongoDatabase database = mongo.getDatabase("eventManagementDb");
    	
		MongoCollection<Document> collection =       database.getCollection("customerPaymentCollection");
		System.out.println("Collection examplesCollection selected successfully");
			 
		System.out.println(cname);
	
		String abc=cname;
		collection.deleteOne(Filters.eq("eventName",abc)); 
		System.out.println("Document deleted successfully..."); 
		
	}
	
	
	public List<CustomerPayment> getPendingCustomerPayment() {
		 String str="";
		 MongoClient mongo = new MongoClient( "localhost" , 27017 );
		   MongoCredential credential;
		   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
		   "password".toCharArray()); 
		   System.out.println("Connected to the database successfully");  
		   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
		   MongoCollection<Document> collection =    database.getCollection("customerPaymentCollection");
		   System.out.println("Collection examplesCollection selected successfully");
		   
		   System.out.println("QWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
		   FindIterable<Document> iterDoc = collection.find(); 
		   int i = 1;
		   ArrayList<CustomerPayment> evlst = new ArrayList<CustomerPayment>();
		   Iterator it = iterDoc.iterator(); 
		   while (it.hasNext()) { 
			   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
			   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
			   txt=txt.replace(",\" ", ",\"");
		   System.out.println(txt); 
		   Gson g = new Gson();
		  // String tt="{_id=5d689d48eed0221aac329a6b/ename=divya/elocation=wariyapola/etype=Birthday Parties/ephoneNo=0718505103/edate=2019-08-28, etime=10.0, estatus=request}";
		   CustomerPayment p = g.fromJson(txt, CustomerPayment.class);
		   System.err.println(p.getEventName());
		   evlst.add(p);
		   i++; 
		   }
		   for(CustomerPayment p:evlst){
			   System.err.println("yyyyy"+p.getEventName());
		   }
		return evlst;
		 }
		public void updateCustomerPayment(CustomerPayment customerPayment,String ename) {
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			   MongoCredential credential;
			   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
			   "password".toCharArray()); 
			   System.out.println("Connected to the database successfully");  
			   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
			   MongoCollection<Document> collection =    database.getCollection("customerPaymentCollection");
			   System.out.println("Collection examplesCollection selected successfully");
			   
			   collection.updateOne(Filters.eq("eventName", ename), Updates.set("states", "Paid"));
			  // collection.updateOne(Filters.eq("eventName", ename), Updates.set("paymentType",customerPayment.getPaymentType()));
			  // collection.updateOne(Filters.eq("eventName", ename), Updates.set("customerPrice",customerPayment.getCustomerPrice()));
			  //collection.updateOne(Filters.eq("eventName", ename), Updates.set("customerDiscount",customerPayment.getCustomerDiscount()));
			  //collection.updateOne(Filters.eq("eventName", ename), Updates.set("customerPayment",customerPayment.getCustomerTotalPrice()));
				
				 
				System.out.println("Collection examplesCollection updated successfully");
		}
		
		
		public void viewCustomerPayment(CustomerPayment customerPayment,String ename) {
			MongoClient mongo = new MongoClient( "localhost" , 27017 );
			   MongoCredential credential;
			   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
			   "password".toCharArray()); 
			   System.out.println("Connected to the database successfully");  
			   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
			   MongoCollection<Document> collection =    database.getCollection("customerPaymentCollection");
			   System.out.println("Collection examplesCollection selected successfully");
			   
			  //collection.viewOne(Filters.eq("eventName", ename), Views.set("states", "Paid"));
			  // collection.viewOne(Filters.eq("eventName", ename), Views.set("paymentType",customerPayment.getPaymentType()));
			  // collection.viewOne(Filters.eq("eventName", ename), Views.set("customerPrice",customerPayment.getCustomerPrice()));
			  //collection.viewOne(Filters.eq("eventName", ename), Views.set("customerDiscount",customerPayment.getCustomerDiscount()));
			  //collection.viewOne(Filters.eq("eventName", ename), Views.set("customerPayment",customerPayment.getCustomerTotalPrice()));
				
				 
				System.out.println("Collection examplesCollection updated successfully");
		}
		
		public CustomerPayment getCustomerPayment(String ename) {
			 String str="";
			 MongoClient mongo = new MongoClient( "localhost" , 27017 );
			   MongoCredential credential;
			   credential = MongoCredential.createCredential("EventManagement",    "eventManagementDb", 
			   "password".toCharArray()); 
			   System.out.println("Connected to the database successfully");  
			   MongoDatabase database = mongo.getDatabase("eventManagementDb");  
			   MongoCollection<Document> collection =    database.getCollection("customerPaymentCollection");
			   System.out.println("Collection examplesCollection selected successfully");
			   
			   FindIterable<Document> iterDoc = collection.find(Filters.eq("eventName", ename)); 
			   int i = 1;
			   CustomerPayment p=new CustomerPayment();
			   Iterator it = iterDoc.iterator(); 
			   while (it.hasNext()) { 
				   String txt=((it.next().toString().replace("{{", "{\"")).replace("}}", "\"}")).replace("Document", "");
				   txt=((txt.replace("=", "\":\"")).replace(",", "\",\""));
				   txt=txt.replace(",\" ", ",\"");
				   txt= txt.replace("_id", "id");
			   Gson g = new Gson();
			  
			    p = g.fromJson(txt, CustomerPayment.class);
			  
			   }
			    System.out.println(p.getCustomerName());
			   return p;
			 
			 }
		
		 }
	



