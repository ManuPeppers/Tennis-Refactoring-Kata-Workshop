
public class TennisGame {

    Scores scores;
    private ScoreBoard scoreBoard;
    private Player player1;
    private Player player2;

    public TennisGame(String namePlayer1, String namePlayer2) {
        this.scores = new Scores();
        this.scoreBoard = new ScoreBoard(scores);
        this.player1 = new Player(namePlayer1);
        this.player2 = new Player(namePlayer2);
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(player1.name)) {
            scores.incrementPointPlayer1();
        } else {
            scores.incrementPointPlayer2();
        }
    }

    public String getScore(){
        return scoreBoard.displayPoints();
    }

}
