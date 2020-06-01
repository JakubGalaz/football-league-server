package com.example.footballleague.controller;

import com.example.footballleague.model.Player;
import com.example.footballleague.model.Team;
import com.example.footballleague.service.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")

@RestController

public class TeamController {
   private final TeamService teamService;


    public TeamController(TeamService teamService) {

        this.teamService = teamService;
    }

    @PostMapping("/saveTeam")
    public ResponseEntity create(@RequestBody Team team){
        System.out.println("CREATE Team");
        return ResponseEntity.ok(teamService.save(team));
    }

    @GetMapping("/teams")
    public List<Team> teamList(){return teamService.teamList();}

    @RequestMapping(value = "/showTeamById/{id}", method = RequestMethod.GET)

    public Optional<Team> showTeam(@PathVariable("id") String id){
        return teamService.findFirstById(id);
    }


    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") String id){

        teamService.deleteTeamById(id);

    }


}
