package packtPub;

public class Game {

    private String name;


    public Game(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public int  generateRandom(){

        int answer = (int) (Math.random() * 10);
            return answer;

    }



}
