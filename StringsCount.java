package packtPub;

import java.util.Scanner;

public class StringsCount {

    public static int countWords (String s) {

        int count = 0;

        if (!(s == null || s.isEmpty())){
            String w[] = s.split("\\w+");
            count = w.length;
        }

        return count;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a string");
        String s = input.nextLine();

        System.out.println(countWords(s));

    }
}

    class CountSymbols{

        public static int countSymbol(String s, boolean countSpaces) {

            int count = 0;
            if (!(s == null || s.isEmpty())) {

                if (countSpaces) {
                    count = s.length();
                } else {
                    count = s.replace(" ", "").length();
                }
            }
                return count;


        }

        public static void main(String[] args) {

            String s = "this is our home";


            System.out.println(countSymbol(s, false));


        }
    }


    class dlklk{

        public static int countWords(String words) {
            int count = 0;

            if (!( words == null || words.isEmpty())){

                String [] w = words.split("\\s+");

                count = w.length;
            }

            return count;
        }

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("enter words");

            String s = input.nextLine();

            System.out.println(countWords(s));

        }
    }

    class kk{

        public static int symbolsCount(String s, boolean countWords) {

            int count = 0;

            if (!(s == null || s.isEmpty())){

                if (countWords){
                    count = s.length();
                }
                else {
                    count = s.replace(" ", "").length();
                }
            }
            return count;

        }

        public static void main(String[] args) {

            Scanner input =new Scanner(System.in);

            System.out.println("enter words");
            String s = input.nextLine();

            System.out.println(symbolsCount(s, true));
        }
    }

    class dhdfh{

        public static int countSymbols(String s, boolean countSym) {

            int count = 0;
            if (!(s == null || s.isEmpty())){

                if (countSym){
                    count = s.length();
                }
                else {
                    count = s.replace(" ", "").length();
                }
            }

            return count;

        }
        public static void main(String[] args) {

        }
    }