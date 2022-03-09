package packtPub;

public class GameLauncher {

    public static void main(String[] args) {

        Game newGame = new Game("play");
        newGame.generateRandom();
        System.out.println(newGame.generateRandom());

        Player1 firstPlayer= new Player1("first", 7);
        System.out.println(firstPlayer.getName());
        System.out.println("this is the number guessed " + firstPlayer.generateRandom1());

        player2 secondPlayer = new player2("second", 5 );

        System.out.println(secondPlayer.getName());
        System.out.println("this is the second number guessed" + secondPlayer.generateRandom2());


    }

}
