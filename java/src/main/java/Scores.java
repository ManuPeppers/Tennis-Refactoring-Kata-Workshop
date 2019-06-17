public class Scores {

    private int pointPlayer1;
    private int pointPlayer2;

    public Scores (){
        pointPlayer1=0;
        pointPlayer2=0;
    }

    public int getPointPlayer1() {
        return pointPlayer1;
    }

    public int getPointPlayer2() {
        return pointPlayer2;
    }

    public void incrementPointPlayer1(){

        pointPlayer1 +=1;
    }

    public void incrementPointPlayer2(){

        pointPlayer2 +=1;
    }

}