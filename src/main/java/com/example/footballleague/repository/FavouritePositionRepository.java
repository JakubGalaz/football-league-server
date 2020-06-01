package com.example.footballleague.repository;


import com.example.footballleague.model.FavouritePosition;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouritePositionRepository extends MongoRepository<FavouritePosition, String> {



}
