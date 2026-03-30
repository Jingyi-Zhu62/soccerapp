package com.example.soccerapp.iterator;

import com.example.soccerapp.model.Team;

import java.util.List;

public class TeamIterator {

    private List<Team> teams;
    private int index = 0;

    public TeamIterator(List<Team> teams) {
        this.teams = teams;
    }

    public boolean hasNext() {
        return index < teams.size();
    }

    public Team next() {
        return teams.get(index++);
    }
}