
public class TennisGame {

    private ScoreBoard scoreBoard;
    private Player player1;
    private Player player2;

    public TennisGame(String namePlayer1, String namePlayer2) {
        this.scoreBoard = new ScoreBoard();
        this.player1 = new Player(namePlayer1);
        this.player2 = new Player(namePlayer2);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.name)) {
            scoreBoard.scorePlayers.incrementPointPlayer1();
        } else {
            scoreBoard.scorePlayers.incrementPointPlayer2();
        }
    }

    public String getScore(){
        return scoreBoard.displayPoints();
    }

}
