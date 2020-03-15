/**
 * Hauptklasse
 */
public class Hauptklasse {

    public static void main(String[] args) {
        ParentErber parentErber1 = new ParentErber();
        
        ParentFlow parentFlow1 = new ParentFlow();
        parentFlow1.setParent(parentErber1);
        parentFlow1.start();
    }
}