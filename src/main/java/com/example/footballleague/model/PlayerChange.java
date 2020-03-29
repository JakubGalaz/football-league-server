package com.example.footballleague.model;

import org.springframework.data.annotation.Id;

public class PlayerChange {

    @Id
    private String id;
    private Player oldPlayer;
    private Player newPlayer;
    private int minute;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Player getOldPlayer() {
        return oldPlayer;
    }

    public void setOldPlayer(Player oldPlayer) {
        this.oldPlayer = oldPlayer;
    }

    public Player getNewPlayer() {
        return newPlayer;
    }

    public void setNewPlayer(Player newPlayer) {
        this.newPlayer = newPlayer;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;;
    }

    public PlayerChange(String id, Player oldPlayer, Player newPlayer, int minute) {
        this.id = id;
        this.oldPlayer = oldPlayer;
        this.newPlayer = newPlayer;
        this.minute = minute;
    }

    public PlayerChange(){

    }



}
