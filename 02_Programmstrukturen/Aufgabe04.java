import java.util.Scanner;

public class Aufgabe04 {

    public static void primzahlrechnerNormal(){
        System.out.println("Bitte wählen Sie die auszgebenden Primzahlen bis zur Zahl x aus:");

        int anzahl_Primzahlen = new Scanner(System.in).nextInt();
        System.out.println("Sie wünschen die Primzahlen bis "+anzahl_Primzahlen+".");
        
        int zu_prüfende_zahl = 1;
        int primzahl_liste[] = new int[anzahl_Primzahlen]; 

        //Test for Primzahl
        for(int i = 0; i < anzahl_Primzahlen; i++){
            boolean primzahl_test = false;

            for(int e = 2; e < zu_prüfende_zahl; e++){
                if(zu_prüfende_zahl % e == 0){
                   primzahl_test = false;
                   break;
                }
                else{
                    primzahl_test = true;
                }
            }

            //fülle 1 & 2 als Primzahl in das Array
            primzahl_liste[0] = 1;
            primzahl_liste[1] = 2;

            if(primzahl_test){
                primzahl_liste[i] =  zu_prüfende_zahl;
            }
            zu_prüfende_zahl += 1;
        }

        //Ausgabe Array
        for(int x = 0; x < primzahl_liste.length; x++){
            if(primzahl_liste[x] == 0){

            }
            else{
                System.out.print(primzahl_liste[x]+", ");
            }
        }
    }
}