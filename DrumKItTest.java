package packtPub;

public class DrumKItTest {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();


        if (d.snare == true ){
            d.playSnare();
        }
        else {
            d.snare = false;
        }


        if (d.topHat == true){
            d.playTopHat();
        }
        else {
            d.topHat = false;
        }
    }
}
