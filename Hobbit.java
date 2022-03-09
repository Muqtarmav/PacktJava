package packtPub;

public class Hobbit {
    String name;

    public static void main(String[] args) {


        Hobbit[] hobbit = new Hobbit[3];
        int z = 0;

        while (z < 4) {
            z = z + 1;
            hobbit[z] = new Hobbit();
            hobbit[z].name = "bilbo";

            if (z == 1) {
                hobbit[z].name = "fildo";
            }

            if (z == 2) {
                hobbit[z].name = "kildo";
            }

            System.out.print(hobbit[z].name + " is a ");
            System.out.println("good Hobbit name");
        }
    }

    }

    class tryingNew{
        public static void main(String[] args) {

            int [] index = new int[4];

            index[0] = 1;
            index[1]= 0;
            index[2]= 3;
            index[3] = 2;

            String[] island = new String[4];
            island[0] = "communal";
            island[1] = "fiji";
            island[2] = "bermuda";
            island[3] = "tarkwa";

            int y = 0;
    int ref;
            while(y < 4){
                ref = index[y];
                System.out.println(island[ref]);
                y++;
            }

            }
    }