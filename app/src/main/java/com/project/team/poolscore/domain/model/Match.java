package com.project.team.poolscore.domain.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by borelanjo on 24/02/2018.
 */

public class Match {

    private Player playerOne;
    private Player playerTwo;
    private List<Ball> availableBalls;
    private Player winner;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Match() {
    }

    public Match(Player playerOne, Player playerTwo, List<Ball> availableBalls) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.availableBalls = availableBalls;
        this.startTime = LocalDateTime.now();
    }

    public Match(Player winner, LocalDateTime endTime) {
        this.winner = winner;
        this.endTime = LocalDateTime.now();
    }


}
