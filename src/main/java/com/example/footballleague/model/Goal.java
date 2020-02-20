package com.example.footballleague.model;

public class Goal {

    private String id;
    private Player scorer;
    private Player assistant;
    private Integer minute;

    public Goal() {

    }

    public Goal(String id, Player scorer, Player assistant, Integer minute) {
        this.id = id;
        this.scorer = scorer;
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
