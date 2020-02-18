package service.Impl;


import model.Player;
import org.springframework.stereotype.Service;
import repository.PlayerRepository;
import service.PlayerService;

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
