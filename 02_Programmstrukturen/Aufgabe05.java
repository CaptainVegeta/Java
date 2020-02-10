
import java.util.Scanner;

public class Aufgabe05{

    public static void notentester(){
        System.out.println("Sie haben Aufgabe 5 gewählt. Bitte geben Sie eine Seriennummer zur Prüfung an.");
        System.out.println("Beispiele dazu wären: S36734198092 | X91424776826 | N15000723228 | X12345678902");
        String seriennummer = new Scanner(System.in).nextLine();

        System.out.println("Sie haben Aufgabe 5 gewählt. Die Seriennumer ist: "+seriennummer);

        //String zu Array aus Char bilden
        char[] buchstaben = seriennummer.toCharArray();
        System.out.println("Der Buchstabe ist: "+buchstaben[0]);

        //Numerischen Wert des Char bilden (ASCII)
        int charToInt = Character.getNumericValue(buchstaben[0]) - 9;
        System.out.println("Der Buchstabe als Zahl ist: "+charToInt);

        //Quersumme der Zahl des Buchstaben rechnen
        charToInt = Aufgabe05.quersumme(charToInt);
        System.out.println("Quersumme der Zahl des Buchstaben: "+charToInt);

        //Summieren
        int sum = charToInt;
        for(int i = 1; i < buchstaben.length-1; i++){
            sum = sum + Character.getNumericValue(buchstaben[i]);
        }
        System.out.println("Die Summe ist: "+sum);

        //9er Rest + 8 - rest
        int rest = sum % 9;
        int prüfziffer = 0;
        if(8 - rest == 0){
            prüfziffer = 9;
        }
        else{
            prüfziffer = 8 - rest;
        }
        
        //Prüfung prüfziffer mit letzer Zahl aus SN
        if(prüfziffer == Character.getNumericValue(buchstaben[buchstaben.length-1])){
            System.out.println("Die Seriennummer stimmt. Die Prüfziffer ist: "+prüfziffer+" Diese ist gleich mit der letzten Zahl: "+Character.getNumericValue(buchstaben[buchstaben.length-1]));
        }
        else{
            System.out.println("Die Seriennummer ist falsch. Die Prüfziffer ist: "+prüfziffer+" Jedoch ist dies nicht: "+Character.getNumericValue(buchstaben[buchstaben.length-1]));
        }
    }

    public static int quersumme(int zahl) {
		if (zahl <= 9) return zahl;
		return zahl%10 + quersumme(zahl/10);
	}

}