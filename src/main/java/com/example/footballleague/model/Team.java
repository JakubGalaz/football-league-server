package com.example.footballleague.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Team {

    @Id
    String id;
    String name;
    String coach;
    String stadium;
    Player players[];


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public Team(String id, String name, String coach, String stadium, Player[] players) {
        this.id = id;
        this.name = name;
        this.coach = coach;
        this.stadium = stadium;
        this.players = players;
    }

    public Team() {
    }



}
