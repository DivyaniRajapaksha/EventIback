package com.eventmgr.repositaries;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eventmgr.model.Event;

@Repository
public interface EventRepositary extends MongoRepository<Event,String>{

}
