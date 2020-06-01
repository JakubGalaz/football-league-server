package com.example.footballleague.model;

import org.springframework.data.annotation.Id;

public class FavouritePosition {


    @Id
    private String id;
    private String email;
    private String type;
    private String idPosition;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(String idPosition) {
        this.idPosition = idPosition;
    }

    public FavouritePosition(String id, String email, String type, String idPosition) {
        this.id = id;
        this.email = email;
        this.type = type;
        this.idPosition = idPosition;
    }

    public  FavouritePosition(){

    }


}
