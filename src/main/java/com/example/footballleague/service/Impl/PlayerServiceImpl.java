package com.example.footballleague.service.Impl;


import com.example.footballleague.model.Player;
import com.example.footballleague.service.PlayerService;
import org.springframework.stereotype.Service;
import com.example.footballleague.repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Player> findFirstById(String id) {
        return playerRepository.findById(id);
    }

//    @Override
//    public void delete(String id) {
//        Optional<Player> player = playerRepository.findById(id);
//           playerRepository.delete(player);
//    }


}
