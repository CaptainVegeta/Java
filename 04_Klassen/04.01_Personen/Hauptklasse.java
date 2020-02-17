/**
 * Hauptklasse
 */
public class Hauptklasse {

    public static void main(String[] args) {

        int arrayGroesse = 10;
        Person[] person = new Person[arrayGroesse];
        for (int i = 0; i < person.length; i++) {
            person[i] = new Person();
        }
        person[0].aendereAttribute("Murat", 26, 1.75f);
        person[1].aendereAttribute("Michael", 26, 1.75f);
        person[2].aendereAttribute("Dan", 40, 1.80f);
        person[3].aendereAttribute("Miguel", 29, 1.80f);
        person[4].aendereAttribute("Lukas", 26, 1.78f);
        person[5].aendereAttribute("Son Goku", 100, 2.0f);
        person[6].aendereAttribute("Martin", 26, 1.75f);
        person[7].aendereAttribute("Alex", 28, 1.75f);
        person[8].aendereAttribute("Daniel", 42, 1.80f);
        person[9].aendereAttribute("Runaldu", 32, 1.80f);

        // Alter berechnen
        int summe = 0;
        for (int i = 0; i < person.length; i++) {
            summe = summe+person[i].alter;
            System.out.print(person[i].alter+", ");
        }
        int durschnittsAlter = summe / person.length;
        System.out.println("= "+summe);
        System.out.println("Das Durchschnittsalter beträg: "+durschnittsAlter);

        // Ausgabe wer unter/über dem Durchschnitt ist
        for (int i = 0; i < person.length; i++) {
            if (person[i].alter < durschnittsAlter) {
                System.out.println(person[i].name+" ist unter dem Durschnittsalter.");
            }
            else{
                System.out.println(person[i].name+" ist über dem Durschnittsalter.");
            }
        }
    }
}