package com.project.team.poolscore.domain.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by borelanjo on 24/02/2018.
 */

public class Game {

    private Player playerOne;
    private Player playerTwo;
    private Player winner;
    private Match currentMatch;
    private List<Match> matches;
    private LocalDateTime startTime;
    private LocalDateTime endTime;


    public Game() {
    }

    public Game(Player playerOne, Player playerTwo, List<Match> matches) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.matches = matches;
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

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Match getCurrentMatch() {
        return currentMatch;
    }

    public void setCurrentMatch(Match currentMatch) {
        this.currentMatch = currentMatch;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Game{" +
                "playerOne=" + playerOne +
                ", playerTwo=" + playerTwo +
                ", currentMatch=" + currentMatch +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
