import java.util.Scanner;

public class Aufgabe02{

    public static void athiopian(){
        System.out.println("Gib 2 Zahlen zur Multiplikation an:");
        int zahl1 = new Scanner(System.in).nextInt();
        int zahl2 = new Scanner(System.in).nextInt();
        System.out.println();


        //Die Länge des Arrays abhängig der zahl1 ausfindig machen.
        int resultat = zahl1;
        int i = 0;
        while(resultat != 1){
            resultat = resultat / 2;
            i = i + 1;
        }
        i = i + 1; //Damit Array +1 länger wird und die eingegebenen Zahlen auch im Array steht

        //Die zahl1 halbierend in ein Array füllen
        int reihe_zahl1[] = new int[i];
        resultat = zahl1;
        i = 0;
        reihe_zahl1[i] = resultat;
        System.out.println(reihe_zahl1[i]);
        i = i + 1;
        while(resultat != 1){
            resultat = resultat / 2;
            reihe_zahl1[i] = resultat;
            System.out.println(reihe_zahl1[i]);
            i = i + 1;
        }
        
        //Test und Darstellungshilfe
        System.out.println();
        System.out.println("i ist = "+i);
        System.out.println();
        
        //Die zahl2 verdoppelnd in ein Array füllen
        int reihe_zahl2[] = new int[i];
        int verdoppelt = zahl2;
        int z = 0;
        reihe_zahl2[z] = verdoppelt;
        System.out.println(reihe_zahl2[z]);
        z = z + 1;
        while(i != 1){
            verdoppelt = verdoppelt * 2;
            reihe_zahl2[z] = verdoppelt;
            System.out.println(reihe_zahl2[z]);
            z = z + 1;
            i = i - 1;
        }

        System.out.println(); //Darstellung

        //zu löschende Zahlen im 2. Array bestimmen und die verbleibenden Zahlen summieren
        int endresultat = 0;
        for(int y = 0; y < reihe_zahl1.length; y++){
            if(reihe_zahl1[y] % 2 == 0){
                reihe_zahl2[y] = 0;
            }
            endresultat = endresultat + reihe_zahl2[y];
            System.out.println(reihe_zahl2[y]);
        }

        System.out.println(); //Darstellung

        //Ausgabe der Multiplikation
        System.out.println("Die Multiplikation der Zahlen "+zahl1+" und "+zahl2+" ergibt: "+endresultat);
    }
}