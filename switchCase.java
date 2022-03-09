package packtPub;

import jdk.swing.interop.SwingInterOpUtils;

public class switchCase {

    public static void main(String[] args) {

        int season = 3;
        String message;

            switch (season){
            case 1 : message = "winter";
            break;
            case 2 : message = "summer";
            break;
            case 3 : message = "spring";
            break;
            default: message = "this is not a season";
        }
        System.out.println(message);

    }
}

    class fk{
        public static void main(String[] args) {

            int cities = 2;
            String message;

            switch (cities){
                case 0 : message = "ibadan";
                break;
                case 1 : message = "lagos";
                break;
                case 2 : message = "abuja";
                break;
                default:message= "cites not present";
            }
            System.out.println(message);
        }
}
    class wkd{
        public static void main(String[] args) {

            String name = "D";
            String message;

            switch (name){
                case "A" : message = "fatai";
                break;
                case "B" : message = "kunle";
                break;
                case "C" : message = "Muqtar";
                break;
                case "D" : message = "taiwo";
                break;
                default: message = "name is not present";
            }

            System.out.println(message);
        }
    }

    class oflks{
        public static void main(String[] args) {

            String []letters = {"A", "B", "C"};

            for ( String letter : letters){
                System.out.println(letter);

                if ( letter.equals("A")){
                    System.out.println("true");
                }
            }

            for ( int count = 0; count < letters.length; count++) {
                System.out.println(letters[count]);

                if (letters[count].equals("A")) {
                    System.out.println("yeah");
                }
            }

            int i = 1;
            while ( i < 10){

                if ( i == 5){
                    continue;
                }
                System.out.println(i);
                i+= 2;

            }

        }
    }

    class dkk{
        public static void main(String[] args) {

            for ( int count = 0; count < args.length; count++){
                System.out.println(args[count]);
            }
        }
    }