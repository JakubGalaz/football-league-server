package com.example.footballleague.controller;

import com.example.footballleague.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.footballleague.repository.PlayerRepository;
import com.example.footballleague.service.PlayerService;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class PlayerController {


    private final PlayerRepository playerRepository;
    private final PlayerService playerService;

    public PlayerController(PlayerRepository playerRepository, PlayerService playerService)
    {
        this.playerRepository = playerRepository;
        this.playerService = playerService;
    }


    @PostMapping("/savePlayer")
    public ResponseEntity create(@RequestBody Player player)
    {
        return ResponseEntity.ok(playerService.save(player));
    }

    @GetMapping("/players")
    public List<Player> playerList() {
        return playerService.playerList();
    }

//    @RequestMapping(value = "/deleteMedicine/{id}", method = RequestMethod.DELETE)
//    public void deletePayer(@PathVariable("id") String id){
//        playerService.delete(id);
//    }

    @RequestMapping(value = "/showPlayerById/{id}", method = RequestMethod.GET)
    public Optional<Player> showPlayer(@PathVariable("id") String id){
        return playerService.findFirstById(id);
    }





}
