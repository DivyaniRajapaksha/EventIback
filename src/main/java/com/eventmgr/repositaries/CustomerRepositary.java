package com.eventmgr.repositaries;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.eventmgr.model.Customer;


public interface CustomerRepositary extends MongoRepository<Customer,Integer>{

}
