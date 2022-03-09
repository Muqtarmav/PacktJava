package packtPub;//package packtPub;
//
//public class SimpleDotCom {
//
//        private int [] locationCells;
//        private int noOfHits = 0;
//        //private int guessNo = 0;
//
//
//        public void setLocationCells(int[] locs) {
//            locationCells = locs;
//        }
//
//
//        public  String checkYourself(String guessNO){
//            int guess = Integer.parseInt(guessNo);
//
//            String result = "miss";
//
//            for (int cell : locationCells) {
//                if (guess == cell) {
//                    result = "hit";
//                    noOfHits++;
//                    break;
//                }
//            }
//
//            if ( noOfHits == locationCells.length){
//                result = "kill";
//            }
//            System.out.println(result);
//            return result;
//        }
//
//    }
//}

import java.util.Scanner;

class NAME{


    public static int countWord(String s) {
        int count = 0;
        if (!(s == null || s.isEmpty())){
            String w [] = s.split("\\s+");
            count = w.length;
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter words");

        String s = input.nextLine();

        System.out.println(countWord(s));
    }

}