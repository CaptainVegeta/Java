import java.util.Scanner;

public class Datenstrukturen{

    public static void main(String[] args) {
        // String eingabe = new Scanner(System.in).nextLine();        
        // System.out.println(eingabe);
        arrayMacher();
        //sekundenZuZeit(0);
        //xyAbstand();
        /*
        int test = (int) Math.pow(5, 3);
        System.out.println(test);
        */
    }

    public static void arrayMacher(){
        float [] mein_array = new float [4];
        mein_array[0]=new Scanner(System.in).nextFloat();
        mein_array[1]=new Scanner(System.in).nextFloat();
        mein_array[2]=new Scanner(System.in).nextFloat();
        mein_array[3]=new Scanner(System.in).nextFloat();
        System.out.println(mein_array[0]+" / "+mein_array[1]+" / "+mein_array[2]+" / "+mein_array[3]);
        System.out.println(mein_array[0]+mein_array[1]+mein_array[2]+mein_array[3]);
    }

    public static void sekundenZuZeit(int seconds){
        int sekunden = new Scanner(System.in).nextInt();
        
        int stunden = sekunden / 3600;
        sekunden = sekunden % 3600;

        int minuten = sekunden / 60;
        sekunden = sekunden % 60;

        System.out.println(stunden+":"+minuten+":"+sekunden);
    }

    public static void xyAbstand(){
        // d:=√[(x2−x1)^2+(y2−y1)^2]
        int x1 = new Scanner(System.in).nextInt();
        int y1 = new Scanner(System.in).nextInt();

        int x2 = new Scanner(System.in).nextInt();
        int y2 = new Scanner(System.in).nextInt();

        float abstand = (float)Math.sqrt((int)Math.pow((x2-x1),2)+(int)Math.pow((y2-y1),2));
        System.out.println("Der Abstand beträgt: "+abstand);
    }
}