public class Player {

    public String name;
    private int pointPlayer1;
    private int pointPlayer2;

    public Player(String name) {
        this.name = name;
        pointPlayer1=0;
        pointPlayer2=0;
    }

    public Player(){

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



    public String getName() {
        return name;
    }

}
