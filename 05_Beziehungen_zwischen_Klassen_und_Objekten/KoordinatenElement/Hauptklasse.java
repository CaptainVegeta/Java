/**
 * Hauptklasse
 */
public class Hauptklasse {

    public static void main(String[] args) {
        
        Kreis kreis1 = new Kreis();
        kreis1.x = 2.0f;
        kreis1.y = 3.0f;
        kreis1.radius = 3.6f;
        System.out.println(kreis1.maxX());
                
        Viereck viereck1 = new Viereck();
        viereck1.x = 5.0f;
        viereck1.y = 6.0f;
        viereck1.seite = 8.8f;
        System.out.println(viereck1.mitteX());
    }
}