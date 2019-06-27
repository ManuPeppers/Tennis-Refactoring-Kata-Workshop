import java.util.HashMap;
import java.util.Map;

public class ScoreBoard {

    int pointPlayer1;
    int pointPlayer2;

    public String displayPoints(int pointPlayer1, int pointPlayer2){

        this.pointPlayer1=pointPlayer1;
        this.pointPlayer2=pointPlayer2;

        int diff = pointPlayer1 - pointPlayer2;

        if (diff==0){
            return equalPoints();
        } else if (pointPlayer1>=4 || pointPlayer2>=4){
            return advantagesPoints();
        } else {
            return oddPoints();
        }
    }

    private String equalPoints(){
        String equalityTranslation[] = {"Love-All","Fifteen-All","Thirty-All","Deuce"};
        return equalityTranslation[pointPlayer1];
    }

    private String oddPoints(){
        String oddTranslation[] = {"Love","Fifteen","Thirty","Forty"};
        return oddTranslation[pointPlayer1]+ "-" + oddTranslation[pointPlayer2];
    }

    private String advantagesPoints(){
        Map<Integer,String> advantageMap=new HashMap<>();

        advantageMap.put(1,"Advantage player1");
        advantageMap.put(-1,"Advantage player2");
        advantageMap.put(2, "Win for player1");
        advantageMap.put(-2,"Win for player2");

        int minusResult = pointPlayer1- pointPlayer2;

        return advantageMap.get(minusResult);
    }
    
}
