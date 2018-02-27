package com.project.team.poolscore.application.service;

import com.project.team.poolscore.domain.model.Game;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by borel on 26/02/2018.
 */

public class GameServiceTest {

    private GameServiceImpl gameService = new GameServiceImpl();

    @Test
    public void configureAGame(){
        String playerOneName = "Elton Leite";
        String playerTwoName = "Victor Nery";
        int qtdOfMatches = 5;

        Game game = gameService.configure(playerOneName, playerTwoName, qtdOfMatches);

        assertNotNull("Era esperado que o jogo existisse", game);

        assertNotNull("Esperado que o Jogador 1 exista", game.getPlayerOne());
        assertEquals("Nome do jogador 1 deve ser "+ playerOneName, playerOneName, game.getPlayerOne().getName());
        assertEquals("Placar do jogador 1 deve iniciar zerado", new Integer(0), game.getPlayerOne().getCurrentScore());
        assertEquals("Jogador 1 não deve iniciar com nenhuma vitória", new Integer(0), game.getPlayerOne().getWins());
        assertTrue("Jogador 1 não deve iniciar com nenhuma bola encaçapada", game.getPlayerOne().getBallLogs().isEmpty());


        assertNotNull("Esperado que o Jogador 2 exista", game.getPlayerTwo());
        assertEquals("Nome do jogador 2 deve ser "+ playerTwoName, playerTwoName, game.getPlayerTwo().getName());
        assertEquals("Placar do jogador 2 deve iniciar zerado", new Integer(0), game.getPlayerTwo().getCurrentScore());
        assertEquals("Jogador 2 não deve iniciar com nenhuma vitória", new Integer(0), game.getPlayerTwo().getWins());
        assertTrue("Jogador 2 não deve iniciar com nenhuma bola encaçapada", game.getPlayerTwo().getBallLogs().isEmpty());

        assertEquals("O jogo deve ter 5 partidas", qtdOfMatches, game.getMatches().size());
        assertEquals("A primeira partida deve ser a primeira da lista", game.getMatches().get(0), game.getCurrentMatch());
        assertEquals("Uma partida deve iniciar com 7 bolas", 7, game.getCurrentMatch().getAvailableBalls().size());
        assertEquals("Uma partida deve ser iniciada pelo Jogador 1", game.getPlayerOne(), game.getCurrentMatch().getCurrentPlayer());
        assertNull("Uma partida não deve ter tempo de inicio na configuração", game.getCurrentMatch().getStartTime());
        assertNull("Uma partida não deve ter  tempo de fim na configuração", game.getCurrentMatch().getEndTime());

        assertNull("O jogo não deve iniciar com um vencedor", game.getWinner());
        assertNull("O jogo não deve ter tempo de inicio na configuração", game.getStartTime());
        assertNull("O jogo não deve ter  tempo de fim na configuração", game.getEndTime());

    }

}
