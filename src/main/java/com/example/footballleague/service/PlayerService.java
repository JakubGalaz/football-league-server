package com.example.footballleague.service;

import com.example.footballleague.model.Player;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    Player save(Player player);
    List<Player> playerList();
//    void delete(String id);
    Optional<Player> findFirstById(String id);
    Player updatePlayer(Player player);
    void deletePlayerById(String id);
}
