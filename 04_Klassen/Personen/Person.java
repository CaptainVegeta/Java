package Personen;

/**
 * Person
 * Erstellen Sie eine Klasse Person welche folgende Variable besitzt: 
 * Name (String), Alter (Integer), Grösse (Float). 
 * Schreiben Sie zudem eine Methode in die Klasse, die, die Variablen formatiert ausgeben
 */
public class Person {

    public static String name;
    public static int alter;
    public static float groesse;

    public static void formatiere(String nameAendern, int alterAendern, float groesseAendern){
        nameAendern = "Murat";
        alterAendern = 26;
        groesseAendern = 1.75f;
    }

    public static void ausgeben(){
        System.out.println(name);
        System.out.println(alter);
        System.out.println(groesse);
    }
}