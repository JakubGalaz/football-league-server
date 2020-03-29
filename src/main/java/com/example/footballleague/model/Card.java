package com.example.footballleague.model;

import org.springframework.data.annotation.Id;



public class Card {

    @Id
    private String id;
    private Player player;
    private int minute;
    private String card;


    public Card(String id, Player player, int minute, String card) {
        this.id = id;
        this.player = player;
        this.minute = minute;
        this.card = card;
    }

    public Card(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }


}
