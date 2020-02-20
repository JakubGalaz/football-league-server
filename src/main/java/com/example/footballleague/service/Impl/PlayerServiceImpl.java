package com.example.footballleague.service.Impl;


import com.example.footballleague.model.Player;
import com.example.footballleague.service.PlayerService;
import org.springframework.stereotype.Service;
import com.example.footballleague.repository.PlayerRepository;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    @Override
    public Player save(Player player) {
        return null;
    }

    @Override
    public List<Player> playerList() {
        return playerRepository.findAll();
    }
}
