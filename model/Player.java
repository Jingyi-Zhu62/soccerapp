package com.example.soccerapp.model;

public class Player implements SoccerEntity {

    private String name;
    private String team;
    private String position;

    public Player(String name, String team, String position) {
        this.name = name;
        this.team = team;
        this.position = position;
    }

    @Override
    public String getId() {
        return name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getPosition() {
        return position;
    }
}