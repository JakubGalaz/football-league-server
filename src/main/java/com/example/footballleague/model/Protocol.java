package com.example.footballleague.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Protocol {


    @Id
    private String id;
    private String refree;
    private String host;
    private String guest;
    private String date;
    private Card[] hostCards;
    private Card[] guestCards;
    private Goal[] hostGoals;
    private Goal[] guestGoals;
    private Player[] hostPlayers;
    private Player[] guestPlayers;
    private PlayerChange[] guestChange;
    private PlayerChange[] hostChange;
    private String comments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRefree() {
        return refree;
    }

    public void setRefree(String refree) {
        this.refree = refree;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Card[] getHostCards() {
        return hostCards;
    }

    public void setHostCards(Card[] hostCards) {
        this.hostCards = hostCards;
    }

    public Card[] getGuestCards() {
        return guestCards;
    }

    public void setGuestCards(Card[] guestCards) {
        this.guestCards = guestCards;
    }

    public Goal[] getHostGoals() {
        return hostGoals;
    }

    public void setHostGoals(Goal[] hostGoals) {
        this.hostGoals = hostGoals;
    }

    public Goal[] getGuestGoals() {
        return guestGoals;
    }

    public void setGuestGoals(Goal[] guestGoals) {
        this.guestGoals = guestGoals;
    }

    public Player[] getHostPlayers() {
        return hostPlayers;
    }

    public void setHostPlayers(Player[] hostPlayers) {
        this.hostPlayers = hostPlayers;
    }

    public Player[] getGuestPlayers() {
        return guestPlayers;
    }

    public void setGuestPlayers(Player[] guestPlayers) {
        this.guestPlayers = guestPlayers;
    }

    public PlayerChange[] getGuestChange() {
        return guestChange;
    }

    public void setGuestChange(PlayerChange[] guestChange) {
        this.guestChange = guestChange;
    }

    public PlayerChange[] getHostChange() {
        return hostChange;
    }

    public void setHostChange(PlayerChange[] hostChange) {
        this.hostChange = hostChange;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }




    public Protocol(String id, String refree, String host, String guest, String date, Card[] hostCards, Card[] guestCards, Goal[] hostGoals, Goal[] guestGoals, Player[] hostPlayers, Player[] guestPlayers, PlayerChange[] guestChange, PlayerChange[] hostChange, String comments) {
        this.id = id;
        this.refree = refree;
        this.host = host;
        this.guest = guest;
        this.date = date;
        this.hostCards = hostCards;
        this.guestCards = guestCards;
        this.hostGoals = hostGoals;
        this.guestGoals = guestGoals;
        this.hostPlayers = hostPlayers;
        this.guestPlayers = guestPlayers;
        this.guestChange = guestChange;
        this.hostChange = hostChange;
        this.comments = comments;
    }



    public Protocol()
    {

    }


}
