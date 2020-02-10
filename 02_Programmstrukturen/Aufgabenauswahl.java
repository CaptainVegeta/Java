import java.util.Scanner;

public class Aufgabenauswahl{
    public static void main(String[] args) {
        System.out.println("Geben Sie die gewünschte Aufgabennummer an. Es bestehen die Aufgaben 1-6: ");
        int auswahl = new Scanner(System.in).nextInt();

        switch(auswahl){
            case 1:
            Aufgabe01.einMalEins();
            break;
            case 2:
            Aufgabe02.athiopian();
            break;
            case 3:
            Aufgabe03.arraySort();
            break;
            case 4:
            Aufgabe04.primzahlrechnerNormal();
            break;
            case 5:
            Aufgabe05.notentester();
            break;
            case 6:
            Programmstrukturen.arrayAufgabe();
            System.out.println();
            System.out.println();
            Programmstrukturen.zahlenReihe();
            System.out.println();
            System.out.println();
            Programmstrukturen.taschenrechner();
            break;
        }
    }


}