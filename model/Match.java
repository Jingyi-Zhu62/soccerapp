package com.example.soccerapp.model;

public class Match implements SoccerEntity {

    private String homeTeam;
    private String awayTeam;
    private String score;

    public Match(String homeTeam, String awayTeam, String score) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = score;
    }

    @Override
    public String getId() {
        return homeTeam + "-" + awayTeam;
    }

    @Override
    public String getName() {
        return homeTeam + " vs " + awayTeam;
    }

    public String getScore() {
        return score;
    }
}