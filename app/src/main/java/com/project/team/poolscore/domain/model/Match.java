package com.project.team.poolscore.domain.model;

import android.text.format.Time;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by borelanjo on 24/02/2018.
 */

public class Match {

    private Player playerOne;
    private Player playerTwo;
    private List<Ball> availableBalls;
    private Player currentPlayer;
    private Player winner;
    private Time startTime;
    private Time endTime;

    public Match() {
    }

    public Match(Player playerOne, Player playerTwo, List<Ball> availableBalls) {
        this.playerOne = playerOne;
        this.currentPlayer = playerOne;
        this.playerTwo = playerTwo;
        this.availableBalls = availableBalls;
        this.startTime = new Time(Time.getCurrentTimezone());
    }

    public Match(Player winner, LocalDateTime endTime) {
        this.winner = winner;
        this.endTime = new Time(Time.getCurrentTimezone());
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public List<Ball> getAvailableBalls() {
        return availableBalls;
    }

    public void setAvailableBalls(List<Ball> availableBalls) {
        this.availableBalls = availableBalls;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}
