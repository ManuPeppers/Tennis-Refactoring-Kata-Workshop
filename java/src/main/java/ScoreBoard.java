import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {

    Scores scores;

    public ScoreBoard(Scores Scores) {
        this.scores = Scores;
    }

    public String displayPoints(){
        int diff = scores.getPointPlayer1() - scores.getPointPlayer2();

        if (diff==0){
            return equalPoints();
        } else if (scores.getPointPlayer1()>=4 || scores.getPointPlayer2()>=4){
            return advantagesPoints();
        } else {
            return oddPoints();
        }
    }

    private String equalPoints(){
        String equalityTranslation[] = {"Love-All","Fifteen-All","Thirty-All","Deuce"};
        return equalityTranslation[scores.getPointPlayer1()];
    }

    private String oddPoints(){
        String oddTranslation[] = {"Love","Fifteen","Thirty","Forty"};
        return oddTranslation[scores.getPointPlayer1()]+ "-" + oddTranslation[scores.getPointPlayer2()];
    }

    private String advantagesPoints(){
        Map<Integer,String> advantageMap=new HashMap<>();

        advantageMap.put(1,"Advantage player1");
        advantageMap.put(-1,"Advantage player2");
        advantageMap.put(2, "Win for player1");
        advantageMap.put(-2,"Win for player2");

        int minusResult = scores.getPointPlayer1()- scores.getPointPlayer2();

        return advantageMap.get(minusResult);
    }
    
}
