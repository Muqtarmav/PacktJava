package packtPub;

import java.util.Scanner;
import java.util.StringTokenizer;

public class practise {


    public static int countWords(String words) {
        int count = 0;

        if (!(words == null || words.isEmpty())) {

            String[] w = words.split("\\s+");

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

class fdlkl{

    public static int countWord(String s) {

        int count = 0;

        if (!( s == null || s.isEmpty())){

            String [] words = s.split("\\s+");

            count = words.length;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter word");
        String s = input.nextLine();

        System.out.println(countWord(s));
      ;

    }
}

class dklw{


    public static int countW(String word) {

        int count = 0;

        if (!( word == null || word.isEmpty())){
            String [] s = word.split("\\s+");

           count = s.length;
        }
return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter words");
        String word = input.nextLine();

        System.out.println(countW(word));

    }
}

class countSymbols{

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


class dke{

    public static int symbol(String word, boolean s) {
        int count = 0;

        if (!(word == null || word.isEmpty())){
            if ( s){
                count = word.length();
            }
            else{
               count = word.replace("", " ").length();
            }
        }
        return count;

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a word");

        String word = input.nextLine();

        System.out.println(symbol(word, true));
    }
}

class fklkw{
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("hello are you new here");

        System.out.println(st.countTokens());

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

class dkl{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("eenter word");
        String word = input.nextLine();


        String [] s = word.split(" ");

        System.out.println(s.length);


    }
}