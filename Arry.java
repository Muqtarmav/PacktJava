package packtPub;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Arry {
    public static void main(String[] args) {


        String [] name = {"ade", "tolu", "ife"};


//        for ( String a : name){
//            System.out.println(a);
//        }

        for (int count = 0; count < name.length; count++ ){
            System.out.println(count);
            System.out.println(name[count]);
        Arrays.sort(name);

           // System.out.println(Arrays.toString(name));
        }
    }
}

class dkdksl{
    public static void main(String[] args) {
        int [] digit = new int[5];

        for ( int count = 0; count < digit.length; count++){
        Arrays.fill(digit, 3);
       //     System.out.println(digit[count]);

            System.out.println(Arrays.toString(digit));
        }

    }
}

class djkDlk{
    public static void main(String[] args) {

        String [] name = {"ade", "femi", "tunike", "yetty"};

//        for ( int count = 0; count < name.length; count++) {
            Arrays.sort(name);
           int search =  Arrays.binarySearch(name, "femi");

            System.out.print(search);
        }
    }


    class kdk{
        public static void main(String[] args) {

     String  [] num = {"1", "3", "6", "1"};

            Set<String> set = new HashSet<>();

     set.addAll(Arrays.asList(num));
            System.out.println(set);
        }

}

class jke{
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("ope");
        list.add("tolu");
        list.add("biola");
        list.add("ade");

        System.out.println(list.size());

        System.out.println(list.indexOf("biola"));
    }
}

class fdkk{

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(4);
        set.add(2);

        System.out.println(set.size());
        //set.remove(2);

        Set<Integer> set1 = new LinkedHashSet<>();



        System.out.println(set.contains(5));

        System.out.println(set.isEmpty());
        System.out.println(set);

    }
}


class dkkd {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter first number");
        int number1 = input.nextInt();

        System.out.println("enter second number");
        int number2 = input.nextInt();

        System.out.println("before swappingh ");
        System.out.println(number2);
        System.out.println(number2);



        int temporary  = number1;
        number1 = number2;

        number2 = temporary;

        System.out.println("after swapping" + number1);
        System.out.println("after swapping " + number2);
    }
}

class fkgfk{
    public static void main(String[] args) {


        String message;

        Scanner input = new Scanner(System.in);
        System.out.println("enter an alphabet");

        String alphabet = input.nextLine();

        switch (alphabet) {

            case "A":
                message = "its a vowel";
                break;
            case "E":
                message = "its a vowel";
                break;

            case "I":
                message = "its a vowel";
                break;

            default:
                message = "this is a consonant";
        }

        System.out.println(message);
    }
    }

        class monthNumber{
            public static void main(String[] args) {
                int message;
                Scanner input = new Scanner(System.in);

                System.out.println("enter a month number");

                int number = input.nextInt();

                switch (number){
                    case 1: message =  31;
                    break;
                    case 2: message = 28;
                    break;
                    case 3: message = 31;
                    break;
                    case 4: message = 30;
                    break;
                    case 5: message = 31;
                    break;
                    case 6: message = 30;
                    break;
                    case 7 : message = 31;
                    break;
                    case 8 : message = 31;
                    break;
                    case 9 : message = 30;
                    break;
                    case 10 : message = 31;
                    break;
                    case 11: message = 31;
                    break;
                    case 12: message = 31;
                    break;

                    default: message = 0;

                    if (message == 0){
                        System.out.println("you have entered an invalid month");
                    }
                }

                System.out.println(message);

            }
        }


class printAlphabet{
    public static void main(String[] args) {
        char count;
        Scanner input = new Scanner(System.in);

        count = input.next().charAt(0);

        for ( count = 'A'; count <= 'Z'; count++){
            System.out.println(count);
        }


    }
}


class lks{
    public static void main(String[] args) {

        int product = 1;
        int count;

        for ( count = 1; count <= 5; count++) {

            System.out.println(product + "*" + count + "=" + product * count);

        }

    }
}

class countDigit {

    public static void main(String[] args) {
        int number = 12993;
        int count = 0;

    }
}

class dk{
    public static void main(String[] args) {

        ArrayList<String> arry = new ArrayList<>();
                arry.add("ball");
                arry.add("leg");
                arry.add("ieop");
                arry.add("erl");
                arry.add("rko");

                for ( String elements : arry){
                    System.out.println(elements.toUpperCase(Locale.ROOT));
                }

        System.out.println(arry.size());
    }
}

class kdks{
    public static void main(String[] args) {

        ArrayList<String> array1 = new ArrayList<>();

        array1.add("lagos");
        array1.add("oyo");
        array1.add("ilorin");
        array1.add("ogun");

        for(String elements : array1){
            System.out.println(elements.toUpperCase(Locale.ROOT));
        }

        System.out.println(array1.lastIndexOf("ogun"));
        System.out.println(array1.get(1));

        System.out.println(array1.indexOf("lagos"));
        System.out.println(array1.size());
        System.out.println(array1);
        System.out.println(array1.contains("oyo"));

        ArrayList<String> color = new ArrayList<>(array1);

        color.add("brown");
        color.add("red");
        color.add("green");

        System.out.println(color);


        System.out.println("adding tWO ARRAYS");

        System.out.println(color);
       // array1.addAll(color);
        System.out.println(array1);
    }
}

    class djLink{
        public static void main(String[] args) {

            LinkedList<String> list = new LinkedList<>();

            list.add("dog");
            list.add("cat");
            list.addFirst("ram");
            list.add("goat");

            System.out.println(list);

            LinkedList<String> list1 = new LinkedList<>(list);
            list1.addFirst("sheep");
            list1.add("lion");

            System.out.println(list1);
        }
    }

    class jk{
        public static void main(String[] args) {
            LinkedList<Integer> num = new LinkedList<>();

            num.add(1);
            num.add(5);
            num.addFirst(6);

            num.add(2, 4);
            System.out.println(num);
        }
    }

    class dkw{
        public static void main(String[] args) {

            String [] color = {"yellow", "blue", "green"};

            LinkedList<String> link = new LinkedList<>(Arrays.asList(color));

            link.add("orange");
            link.add("grey");
            link.addFirst("violet");

            System.out.println(link.size());

            Collections.sort(link);
            Collections.sort(link, Collections.reverseOrder());

            System.out.println(Collections.binarySearch(link, "blue"));

            System.out.println(Collections.frequency(link, "yellow"));

            System.out.println(link);
        }
    }

    class iei{
        public static void main(String[] args) {

            Set<String> set = new HashSet<>();
            set.add("wiz");
            set.add("mav");
            set.add("kida");
            set.add("wiz");
            set.add("wizzy");


            System.out.println(set);

        }
    }


    class eow {
        public static void main(String[] args) {

            Map<String, Integer> newMap = new HashMap<>();

            newMap.put("ade", 15);
            newMap.put("mav", 16);
            newMap.put("segs", 17);

            System.out.println(newMap);
            System.out.println(newMap.get("mav"));


            Map<Integer, String> map = new TreeMap<>();

            map.put(1, "apple");
            map.put(2, "orange");
            map.put(5, "boli");
            map.put(3, "guava");
            map.put(4, "grape");

            System.out.println(map.size());


            System.out.println(map.values());



            if (map.containsKey(1)){
                System.out.println("your favorite fruit by the way lol");
            }

            System.out.println(map);



        }
    }


    class PrintNonDuplicate{


        public static void nonDuplicate(Collection<String> values) {

            Set<String> set = new HashSet<>(values);

            for ( String element : set){
                System.out.println(element);
            }

            System.out.println();
        }

        public static void main(String[] args) {

            String [] color = {"brown", "red", "blue", "black", "red", "blue"};
            List<String> list = Arrays.asList(color);

            System.out.println(list);

            nonDuplicate(list);
        }
    }

    class jkdk{

        public static void nonDupli(Collection<String> values) {

            Set<String> set = new HashSet<>(values);

            for ( String b : set){
                System.out.println(b);
            }

        }
        public static void main(String[] args) {

            String [] name = {"ade", "segs", "mav", "ade", "tolu", "mav", "biola"};

            List<String> list = Arrays.asList(name);

            System.out.println(list);

            nonDupli(list);
        }



    }

    class EliminateDuplicateName{

        public static void noDuplicate(Collection<String> name) {

            Set<String> set = new HashSet<>(name);

            for ( String values : set){
                System.out.println(values);
            }

        }


    public static void main(String[] args) {

            String [] name = new String[5];

            Scanner input = new Scanner(System.in);

        System.out.println("enter names");
            for ( int count = 0; count < name.length; count++) {
                name[count] = input.nextLine();
            }
            List<String> list = Arrays.asList(name);
        System.out.println(list);

        noDuplicate(list);
        }
    }

    class jdk{

        public static void nooduplicate(Collection<String> values) {

            Set<String> set = new HashSet<>(values);

            for ( String c : set){
                System.out.println(c);
            }

        }
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String [] names = new String[5];


            System.out.println("enter names");

            for ( int count = 0; count < names.length; count++) {

                names[count] = input.nextLine();
            }
                List<String> list = Arrays.asList(names);

                System.out.println(list);

                nooduplicate(list);


        }
    }

    class fdk{
        public static void main(String[] args) {

            String [] name = {"tife", "segs", "mav", "ade", "binta", "sarnk", "binta", "mav"};


           List<String> list =Arrays.asList(name);

            System.out.println(list);

            Set<String> set = new HashSet<>(list);
            for ( String c : set){
                System.out.println(c);
                //System.out.println(c.toUpperCase(Locale.ROOT));
            }


        }

        }

        class flld{
            public static void main(String[] args) {

                Set<String> set = new LinkedHashSet<>();

                set.add("brown");
                set.add("yellow");
                set.add("blue");
                set.add("red");
                set.add("blue");

                System.out.println(set);

                System.out.println(set.size());
                System.out.println(set.contains("yellow"));

                Set<String> newSet = new HashSet<>();
                newSet.add("lagos");
                newSet.add("kano");

                System.out.println(newSet);

                newSet.addAll(set);
                System.out.println(newSet);

            }

        }


        class kek{
            public static void main(String[] args) {

                List<String> list = new ArrayList<>();
                list.add("a");
                list.add("b");
                list.add("c");
                list.add("d");


                System.out.println(list.get(2));
                System.out.println(list.size());
                System.out.println(list);


                List<String> list2 = new ArrayList<>();

                list2.add("goat");
                list2.add("ram");

                list2.addAll(list);
                System.out.println(list2);
                //System.out.println(list2);
            }
        }

        class djwkwk{
            public static void main(String[] args) {

                String [] name ={"fola", "adigun", "nura", "segs"};
               // Arrays.sort(name);

                List<String> list = new ArrayList<>(Arrays.asList(name));
                list.add("tife");
                list.add("mav");


                int search = Arrays.binarySearch(name, "adigun");

                System.out.println(search);


                System.out.println(list);
            }
        }

        class dskk{
            public static void main(String[] args) {

                Map<String, String> map =  new HashMap<>();

                map.put("name", "ade");
                map.put("age", "15");
                map.put("state", "kwara");
                map.put("email", "mavic@gmail.com");

                System.out.println(map);

                System.out.println(map.get("name"));

                System.out.println(map.values());


            }
        }

        class lem{

            public static void Nodup(Collection<String>values) {

                Set<String> set = new HashSet<>(values);

                for ( String s : set){
                    System.out.println(s);
                }

            }

            public static void main(String[] args) {

                Scanner input = new Scanner(System.in);


                String names[] = new String[5];
                System.out.println("enter names n");
                for ( int count = 0; count < names.length; count++){
                    names[count] = input.nextLine();
                }

                List<String> list = Arrays.asList(names);
                System.out.println(list);


                Nodup(list);
            }
        }

        //String methds


    class fj{
        public static void main(String[] args) {

            String [] name = {"a", "b", "c", "d", "e"};

            for ( int count = 0; count < name.length; count++){
                System.out.println(name[count]);
            }

            String name2 = "hello there";


            for ( int count = name2.length() - 1; count >= 0; count--){
                System.out.print(name2.charAt(count));
            }

        }
    }

    class fdoe{
        public static void main(String[] args) {

//            String s = "hello";
//            String s1 = "hi";
//            String s2 = "hello";
//
//            String s3 = new String("yellow");
//            String s4= new String("yellow");
//
//            if ( s3.equals(s4)){
//                System.out.println("its equal");
//            }
//
//            if ( s3 == s4){
//                System.out.println("yes equal");
//            }
//
//            if ( s.equals(s2)){
//                System.out.println(true);
//            }
//            else {
//                System.out.println(false);
//            }
//
//            if ( s.equals("hello")){
//                System.out.println(true);
//            }
//
//            if ( s.equalsIgnoreCase(s2)){
//                System.out.println("correct");
//            }
//
//            if ( s == s2){
//                System.out.println("right");
//            }

            String words [] = {"started", "starting", "ended", "ending"};

            for ( String c : words){
                //System.out.println(c);

//                if ( c.startsWith("star")) {
//                    System.out.println(c);
//                }

                    if (c.endsWith("ed")){
                        System.out.println(c);
                    }
                }
            }




        }
