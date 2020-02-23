package com.example.footballleague.repository;

import com.example.footballleague.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
//    void delete(Optional<Player> player);
//  List<Player> findAll();
}
