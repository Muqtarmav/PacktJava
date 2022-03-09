package packtPub;

import java.util.Scanner;

public class BloodPressure {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter systolic number");
        int number1 = input.nextInt();

        System.out.println("enter diastolic number");
        int number2 = input.nextInt();

        if ( number1 > 90 && number1 <= 120){
            System.out.println("blood pressure is ideal");
        }
        else if ( number1 > 120 && number1 < 140){
            System.out.println("pre high blood pressure");
        }

        else if (number1 > 140){
            System.out.println("high blood pressure");
        }

        else {
            System.out.println("low blood pressure");
        }


        if ( number2 > 60 && number2 <= 80){
            System.out.println("ideal blood pressure");
        }
        else if (number2 > 80 && number2 < 90){
            System.out.println("pre high blood pressure");
        }

        else if (number2 > 90){
            System.out.println("high blood pressure");
        }

        else {
            System.out.println("low blood pressure");
        }
    }


}

    class JF{

        public static void checkNo(Number num) {

            if ( num instanceof Integer)
                System.out.println("its an integer");


        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("enter an integer");
            int num = input.nextInt();

           checkNo(num);
        }

    }

    class hdj{
        public static void main(String[] args) {

            String name = new String();

            if ( name instanceof String){
                System.out.println("yeah");
            }
        }
    }