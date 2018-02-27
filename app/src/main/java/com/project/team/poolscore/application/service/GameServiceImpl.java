package com.project.team.poolscore.application.service;

import com.project.team.poolscore.domain.model.Ball;
import com.project.team.poolscore.domain.model.Game;
import com.project.team.poolscore.domain.model.Match;
import com.project.team.poolscore.domain.model.Player;
import com.project.team.poolscore.domain.service.GameService;

import java.util.ArrayList;

/**
 * Created by borelanjo on 26/02/2018.
 */

public class GameServiceImpl implements GameService {
    @Override
    public Game configure(String playerOneName, String playerTwoName, int qtdMatches) {
        Player playerOne = configurePlayer(playerOneName);
        Player playerTwo = configurePlayer(playerTwoName);

        ArrayList<Match> matches = configureMatches(playerOne, playerTwo, qtdMatches);

        Game game = new Game(configurePlayer(playerOneName), configurePlayer(playerTwoName), matches);
        game.setCurrentMatch(matches.get(0));

        return game;
    }

    @Override
    public Player configurePlayer(String playerName) {
        Player player = new Player(playerName);
        player.setCurrentScore(0);
        player.setWins(0);
        player.setBallLogs(new ArrayList<Ball>());
        return player;
    }

    @Override
    public ArrayList<Match> configureMatches(Player playerOne, Player playerTwo, int qtdMatches) {
        int qtdBalls = 7;

        ArrayList<Match> matches = new ArrayList<>();

        for (int i = 0; i <qtdMatches ; i++) {
            Match match = new Match();
            match.setCurrentPlayer(playerOne);
            match.setAvailableBalls(configureBalls(qtdBalls));
            match.setPlayerOne(playerOne);
            match.setPlayerTwo(playerTwo);

            matches.add(match);
        }

        return matches;
    }

    @Override
    public ArrayList<Ball> configureBalls(int qtdOfBalls) {
        ArrayList<Ball> balls = new ArrayList<>();

        for (int i = 0; i < qtdOfBalls; i++) {
            Ball ball = new Ball();
            ball.setNumber(i+1);
            balls.add(ball);
        }
        return balls;
    }
}
