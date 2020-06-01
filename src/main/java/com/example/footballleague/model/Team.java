package com.example.footballleague.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Team {

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

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalLost() {
        return goalLost;
    }

    public void setGoalLost(int goalLost) {
        this.goalLost = goalLost;
    }

    public Team(String id, String name, String coach, String stadium, Player[] players, int win, int lose, int draw, int goalsScored, int goalLost) {
        this.id = id;
        this.name = name;
        this.coach = coach;
        this.stadium = stadium;
        this.players = players;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
        this.goalsScored = goalsScored;
        this.goalLost = goalLost;
    }

    @Id
    String id;
    String name;
    String coach;
    String stadium;
    Player players[];
   int win;
   int lose;
   int draw;
   int goalsScored;
   int goalLost;





    public Team() {
    }



}
