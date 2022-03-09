package packtPub;

public class conditionalStatement {
    public static void main(String[] args) {

        int i = 5;
        boolean happy = true;
        boolean sad = false;

        if ( happy)
            System.out.println("I am Happy");

        if (sad){
            System.out.println("SAD IS TRUE");
        }

        if ( i == 5 ){
            System.out.println("i == 5");
        }

    }
}

    class ProductDelivery {
        public static void main(String[] args) {

            int maxDistance = 10;
            int distanceToHome = 11;

            if (maxDistance < distanceToHome) {
                System.out.println("free delivery to them");


                if (maxDistance == distanceToHome) {
                    System.out.println("free delivery to them too");
                }
//
//            if ( distanceToHome > maxDistance){
//                System.out.println("no free delivery");
//            }

            }
        }
    }

        class heartRate{
    public static void main(String[] args) {

        int age = 30;
        int ibm = 150;

        if ( age == 30 && ibm >= 95 || ibm == 160){
            System.out.println("normal");
        }
        else{
            System.out.println("abnormal");
        }


            }
        }


        class rjjf{
            public static void main(String[] args) {

                int x = 2;
                int y = 1;

                if ( (x + y) < 5){
                    System.out.println("less");
                }
            else{
                    System.out.println("true");
                }
            }

        }
