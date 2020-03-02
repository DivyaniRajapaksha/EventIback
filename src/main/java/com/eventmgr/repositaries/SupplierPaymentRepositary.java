package com.eventmgr.repositaries;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eventmgr.model.Supplier;

@Repository
public interface SupplierPaymentRepositary extends MongoRepository<Supplier,String>{

}
