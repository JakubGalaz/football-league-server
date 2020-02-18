package controller;

import model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.PlayerRepository;
import service.PlayerService;

import java.util.List;


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

    @RequestMapping(value = "player", method = RequestMethod.GET, produces = { "application/json" })
    public List<Player> playerList() {
        System.out.println("GET player");
        return playerService.playerList();
    }

}


//    @EventListener(ApplicationReadyEvent.class)
//    public void init() {
//     System.out.println("Add Player");
//        Player player1 = new Player("sdsadaaqqwe12", "32", "dsadd", 12, "FCB", "Napastnik", 12,
//                12,2,3);
//
//        playerRepository.save(player1);
//
//    }
//
//    @CrossOrigin("http://localhost:4200")
//    @GetMapping("/players")
//    public List<Player> getPlayers(){
//System.out.println("GETPlayers");
////        System.out.println(playerRepository.findAll()) ;
//       return playerRepository.findAll();
//    }
