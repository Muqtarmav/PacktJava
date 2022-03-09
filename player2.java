package packtPub;

public class player2 extends Game{
    int guessNo2;

    public player2(String name, int guessNo2) {
        super(name);

        this.guessNo2 = guessNo2;
    }


    public int generateRandom2() {
        if ( guessNo2 == generateRandom()){
            System.out.println("player 2 you are correct");
        }
        if (guessNo2 != generateRandom()){
            System.out.println("player 2 is not correct");
        }

        return guessNo2;
    }

}
