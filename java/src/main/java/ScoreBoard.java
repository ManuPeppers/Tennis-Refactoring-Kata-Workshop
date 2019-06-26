import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {

    Player scorePlayers;

    public ScoreBoard() {
        this.scorePlayers=new Player();
    }

    public String displayPoints(){
        int diff = scorePlayers.getPointPlayer1() - scorePlayers.getPointPlayer2();

        if (diff==0){
            return equalPoints();
        } else if (scorePlayers.getPointPlayer1()>=4 || scorePlayers.getPointPlayer2()>=4){
            return advantagesPoints();
        } else {
            return oddPoints();
        }
    }

    private String equalPoints(){
        String equalityTranslation[] = {"Love-All","Fifteen-All","Thirty-All","Deuce"};
        return equalityTranslation[scorePlayers.getPointPlayer1()];
    }

    private String oddPoints(){
        String oddTranslation[] = {"Love","Fifteen","Thirty","Forty"};
        return oddTranslation[scorePlayers.getPointPlayer1()]+ "-" + oddTranslation[scorePlayers.getPointPlayer2()];
    }

    private String advantagesPoints(){
        Map<Integer,String> advantageMap=new HashMap<>();

        advantageMap.put(1,"Advantage player1");
        advantageMap.put(-1,"Advantage player2");
        advantageMap.put(2, "Win for player1");
        advantageMap.put(-2,"Win for player2");

        int minusResult = scorePlayers.getPointPlayer1()- scorePlayers.getPointPlayer2();

        return advantageMap.get(minusResult);
    }
    
}
