package com.example.soccerapp.data;

import com.example.soccerapp.model.Team;
import com.example.soccerapp.model.Player;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<Team> getTeams() {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Barcelona", "Spain", "La Liga"));
        teams.add(new Team("Man United", "England", "Premier League"));
        return teams;
    }

    public static List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Messi", "Barcelona", "Forward"));
        players.add(new Player("Ronaldo", "Juventus", "Forward"));
        return players;
    }
}