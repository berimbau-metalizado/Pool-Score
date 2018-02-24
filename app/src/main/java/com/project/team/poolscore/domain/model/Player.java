package com.project.team.poolscore.domain.model;

import java.util.List;

/**
 * Created by borelanjo on 24/02/2018.
 */

public class Player {

    private String name;
    private Integer currentScore;
    private List<Ball> ballLogs;
    private Integer wins;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(Integer currentScore) {
        this.currentScore = currentScore;
    }

    public List<Ball> getBallLogs() {
        return ballLogs;
    }

    public void setBallLogs(List<Ball> ballLogs) {
        this.ballLogs = ballLogs;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", currentScore=" + currentScore +
                ", wins=" + wins +
                '}';
    }
}
