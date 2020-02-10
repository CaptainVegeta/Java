import java.util.Scanner;

public class Programmstrukturen{

    public static void arrayAufgabe(){
        int array[] = new int [25];
        int summe = 0;

        for(int g = 0; g < array.length; g++){
            array[g] = (int)Math.pow(2, g);
            //System.out.println(array[g]);
            if(g % 2 == 1){
                summe = summe + array[g];
            }
        }
        System.out.println("Die Summe aller ungeraden Zahlen im Array beträgt: " + summe);
    }
    
    public static void zahlenReihe(){
        int x = 2;
        System.out.println("Geben Sie eine natürliche Zahl ein:");
        int potenz = new Scanner(System.in).nextInt();
        int i = 1;
        System.out.println("Sie haben die Potenz 2^"+potenz+" ausgwählt.");
        while(potenz > 0 && i <= potenz){
            System.out.print((int)Math.pow(x, i)+", ");
            i = i + 1;
        }
    }
    
    public static void taschenrechner(){  
        System.out.println("Geben Sie eine Zahl zwischen 1 und 4 ein. 1 = Addition / 2 = Subtraktion / 3 = Multiplikation / 4 = Division");
        int auswahl = new Scanner(System.in).nextInt();

        if(auswahl > 4 || auswahl < 1){
            System.out.println("Suck my durum! Nur 1-4");
            auswahl = new Scanner(System.in).nextInt();
            for(int i = 1; auswahl > 4 || auswahl < 1; i++){
                if(auswahl > 4 || auswahl < 1){
                    System.out.println("Du möngi scho zum xte Mal! Nur 1-4");
                    auswahl = new Scanner(System.in).nextInt();
                }    
            }
        }

        System.out.println("Geben Sie die 2 Zahlen (reelle Zahl) für die gewünschte Operation an");
        float x1 = new Scanner(System.in).nextFloat();
        float x2 = new Scanner(System.in).nextFloat();

        float ergebnis;

        if(auswahl == 1){
            ergebnis = x1 + x2;
            System.out.println(ergebnis);
        }else if(auswahl == 2){
            ergebnis = x1 - x2;
            System.out.println(ergebnis);
        }else if(auswahl == 3){
            ergebnis = x1 * x2;
            System.out.println(ergebnis);
        }else if(auswahl == 4){
            ergebnis = x1 / x2;
            System.out.println(ergebnis);
        }
    } 
}