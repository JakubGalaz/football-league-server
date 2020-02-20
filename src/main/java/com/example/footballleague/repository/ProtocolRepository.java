package com.example.footballleague.repository;

import com.example.footballleague.model.Protocol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProtocolRepository extends MongoRepository<Protocol, String> {
}
