package com.example.footballleague.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Protocol {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Protocol(String id, String host, String guest, Goal[] hostGoals, Goal[] guestGoals, String referee, Player[] hostPlayers, Player[] guestPlayers, String comments) {
        this.id = id;
        this.host = host;
        this.guest = guest;
        this.hostGoals = hostGoals;
        this.guestGoals = guestGoals;
        this.referee = referee;
        this.hostPlayers = hostPlayers;
        this.guestPlayers = guestPlayers;
        this.comments = comments;
    }

    public Protocol()
    {

    }

    @Id
    private String id;
    private String host;
    private String guest;
    private Goal[] hostGoals;
    private Goal[] guestGoals;
    private String referee;
    private Player[] hostPlayers;
    private Player[] guestPlayers;
    private String comments;



}
