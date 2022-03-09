package packtPub;

public class Player1 extends Game {

    private int guessNo;

    public Player1(String name, int guessNo) {
        super(name);

        this.guessNo = guessNo;
    }

    public int generateRandom1() {

        if (guessNo == generateRandom()) {
            System.out.println(" player 1,  you are correct");
        }
        if ( guessNo != generateRandom()){
            System.out.println("player 1 is not correct");
        }

        return guessNo;
    }



}
