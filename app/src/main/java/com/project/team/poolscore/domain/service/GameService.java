package com.project.team.poolscore.domain.service;

import com.project.team.poolscore.domain.model.Ball;
import com.project.team.poolscore.domain.model.Game;
import com.project.team.poolscore.domain.model.Match;
import com.project.team.poolscore.domain.model.Player;

import java.util.ArrayList;

/**
 * Created by borel on 26/02/2018.
 */

public interface GameService {

    public Game configure(String playerOneName, String playerTwoName, int qtdMatches);

    public Player configurePlayer(String playerName);

    public ArrayList<Match> configureMatches(Player playerOne, Player playerTwo, int qtdMatches);

    public ArrayList<Ball> configureBalls(int qtdOfBalls);
}
