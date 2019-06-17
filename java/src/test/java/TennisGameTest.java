import org.junit.Test;

import static org.junit.Assert.*;

public class TennisGameTest {

    @Test
    public void getScoreStartGame() {

        TennisGame tennisGame = new TennisGame ("player1","player2");

        assertEquals("Love-All",tennisGame.getScore());

    }

    @Test
    public void getScoreFifteenAll(){

        TennisGame tennisGame = new TennisGame ("player1","player2");


        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");

        assertEquals("Fifteen-All", tennisGame.getScore());

    }

    @Test
    public void getScoreThirtyAll(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");

        assertEquals("Thirty-All", tennisGame.getScore());

    }

    @Test
    public void getScoreDeuce(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");

        assertEquals("Deuce",tennisGame.getScore());
    }


    @Test
    public void getScoreFifteenLove(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player1");

        assertEquals("Fifteen-Love",tennisGame.getScore());

    }

    @Test
    public void getScoreThirtyLove(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");

        assertEquals("Thirty-Love",tennisGame.getScore());

    }

    @Test
    public void getScoreFortyLove(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");

        assertEquals("Forty-Love",tennisGame.getScore());

    }

    @Test
    public void getScoreLoveFifteen(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player2");

        assertEquals("Love-Fifteen",tennisGame.getScore());

    }

    @Test
    public void getScoreLoveThirty(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");

        assertEquals("Love-Thirty",tennisGame.getScore());

    }

    @Test
    public void getScoreLoveForty(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");

        assertEquals("Love-Forty",tennisGame.getScore());

    }

    @Test
    public void getScoreAdvantagePlayer1(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");

        assertEquals("Advantage player1", tennisGame.getScore());

    }

    @Test
    public void getScoreAdvantagePlayer2(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");

        assertEquals("Advantage player2", tennisGame.getScore());

    }

    @Test
    public void getScoreWinForPlayer2(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");

        assertEquals("Win for player2", tennisGame.getScore());

    }

    @Test
    public void getScoreWinForPlayer1(){

        TennisGame tennisGame = new TennisGame ("player1","player2");

        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player1");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");
        tennisGame.wonPoint("player2");

        assertEquals("Win for player1", tennisGame.getScore());

    }

}