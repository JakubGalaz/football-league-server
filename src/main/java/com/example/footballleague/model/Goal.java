package com.example.footballleague.model;

import org.springframework.data.annotation.Id;

public class Goal {


    @Id
    private String id;
    private Player scorer;
    private Player assistant;
    private Integer minute;


    public Goal(String id, Player scorer, Player assistant, Integer minute) {
        this.id = id;
        this.scorer = scorer;
        this.assistant = assistant;
        this.minute = minute;
    }

    public Goal() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Player getScorer() {
        return scorer;
    }

    public void setScorer(Player scorer) {
        this.scorer = scorer;
    }

    public Player getAssistant() {
        return assistant;
    }

    public void setAssistant(Player assistant) {
        this.assistant = assistant;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }






}
