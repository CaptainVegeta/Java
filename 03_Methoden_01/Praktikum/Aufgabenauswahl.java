import java.util.Scanner;

public class Aufgabenauswahl{
    public static void main(String[] args) {
        System.out.println("Wähle eine Aufgabe aus (1-6): ");
        int auswahl = new Scanner(System.in).nextInt();

        switch(auswahl){
            case 1:
            System.out.println("Gib eine Zahl für die gewünschte Stelle in der Fibonacci Reihe an: ");
            int anfangs_Zahl = new Scanner(System.in).nextInt(); 
            int zahl = Aufgabe_01.fibonacci(anfangs_Zahl);
            System.out.println("Die Zahl an Stelle "+anfangs_Zahl+" lautet: "+zahl);
            break;

            case 2:
            System.out.println("Gib eine Zahl für die gewünschte Stelle in der Fibonacci Reihe an: ");
            int anfangs_Zahl_02 = new Scanner(System.in).nextInt();
            System.out.println("Die Fibonacci-Reihe lässt sich mathematisch wie folgt ausrechnen: f(n)=f(n-1)+f(n-2)");
            int zahl_02 = Aufgabe_02.fibonacci(anfangs_Zahl_02);
            System.out.println("Die Zahl an Stelle "+anfangs_Zahl_02+" lautet: "+zahl_02);
            break;

            case 3:
            /*
            System.out.println("Gib Radius und x- & y-Koordinate zur Prüfung an: ");
            int r = new Scanner(System.in).nextInt();
            int x = new Scanner(System.in).nextInt();
            int y = new Scanner(System.in).nextInt();
            boolean ist_ein_kreis = Aufgabe_03.kreisRechner(r, x, y);
            System.out.println("Die Koordinaten sind im Kreis = "+ist_ein_kreis);
            */
            Aufgabe_03.kreisRechnerArray();
            break;

            default:
            System.out.println("Diese Aufgabe gibt es nicht...");
            break;
        }
    }
}