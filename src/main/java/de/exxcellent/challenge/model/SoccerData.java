package de.exxcellent.challenge.model;

import de.exxcellent.challenge.model.comparable.Comparable;

public class SoccerData implements Comparable {
    String Team;
    Integer Games,Wins,Losses,Draws,Goals,Goals_Allowed,Points;
    public Integer getGames() {
        return Games;
    }

    public void setGames(Integer games) {
        Games = games;
    }

    public Integer getWins() {
        return Wins;
    }

    public void setWins(Integer wins) {
        Wins = wins;
    }

    public Integer getLosses() {
        return Losses;
    }

    public void setLosses(Integer losses) {
        Losses = losses;
    }

    public Integer getDraws() {
        return Draws;
    }

    public void setDraws(Integer draws) {
        Draws = draws;
    }

    public Integer getGoals() {
        return Goals;
    }

    public void setGoals(Integer goals) {
        Goals = goals;
    }

    public Integer getGoals_Allowed() {
        return Goals_Allowed;
    }

    public void setGoals_Allowed(Integer goals_Allowed) {
        Goals_Allowed = goals_Allowed;
    }

    public Integer getPoints() {
        return Points;
    }

    public void setPoints(Integer points) {
        Points = points;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }


    @Override
    public int compareTo(Object object) {
        return 0;
    }
}
