package com.example.footballleague.controller;


import com.example.footballleague.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.footballleague.service.PlayerService;
import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class PlayerController {


    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }
    
    @PostMapping("/savePlayer")
    public ResponseEntity create(@RequestBody Player player) {
        System.out.println("CREATE PLAYER");
        return ResponseEntity.ok(playerService.save(player));
    }

    @GetMapping("/players")
    public List<Player> playerList() {
        return playerService.playerList();
    }

    @RequestMapping(value = "/showPlayerById/{id}", method = RequestMethod.GET)
    public Optional<Player> showPlayer(@PathVariable("id") String id) {
        return playerService.findFirstById(id);
    }

    @DeleteMapping("/deletePlayerById/{id}")
    public void delete(@PathVariable("id") String id) {

        playerService.deletePlayerById(id);

    }

    @PutMapping("/updatePlayer")
    public Player updatePlayer(@RequestBody Player player) {
        System.out.println("Update PLAYER");
     return playerService.updatePlayer(player);
    }


}
