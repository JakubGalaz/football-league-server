package service;

import model.Player;

import java.util.List;

public interface PlayerService {
    Player save(Player player);
    List<Player> playerList();
}
