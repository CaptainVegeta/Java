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

        person[1].aendereAttribute("Murat", 26, 1.75f);

        person[2].aendereAttribute("Dan", 40, 1.80f);

        person[3].aendereAttribute("Miguel", 29, 1.80f);

        person[4].aendereAttribute("Lukas", 26, 1.78f);
        
        person[5].aendereAttribute("Son Goku", 100, 2.0f);

        person[6].aendereAttribute("Murat", 26, 1.75f);

        person[7].aendereAttribute("Murat", 26, 1.75f);

        person[8].aendereAttribute("Dan", 40, 1.80f);

        person[9].aendereAttribute("Miguel", 29, 1.80f);        
    }

    
}