package com.example.footballleague.model;

import org.springframework.data.annotation.Id;

public class Goal {

    @Id
    private String id;
    private Player scorrer;
    private Player assistant;
    private Integer minute;

    public Goal() {

    }

    public Goal(String id, Player scorrer, Player assistant, Integer minute) {
        this.id = id;
        this.scorrer = scorrer;
        this.assistant = assistant;
        this.minute = minute;
    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Player getScorer() {
        return scorrer;
    }

    public void setScorer(Player scorer) {
        this.scorrer = scorer;
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
