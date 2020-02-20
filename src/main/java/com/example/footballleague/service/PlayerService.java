package com.example.footballleague.service;

import com.example.footballleague.model.Player;

import java.util.List;

public interface PlayerService {
    Player save(Player player);
    List<Player> playerList();
}
