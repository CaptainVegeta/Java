
public class Hauptklasse {

    public static void main(String[] args) {

        RennSchnecke rennSchnecke1 = new RennSchnecke("James Bond", "Hobbit", 7, 0);
        // System.out.println(rennSchnecke1.getData());
    
        RennSchnecke rennSchnecke2 = new RennSchnecke("Hugo Boss", "Chef", 10, 0);
        // System.out.println(rennSchnecke2.getData());
    
        RennSchnecke rennSchnecke3 = new RennSchnecke("Vegeta", "Saiyajin", 20, 0);
        // System.out.println(rennSchnecke3.getData());
    
        Rennen rennen1 = new Rennen();
        rennen1.addRennschnecke(rennSchnecke1);
        rennen1.addRennschnecke(rennSchnecke2);
        rennen1.addRennschnecke(rennSchnecke3);
    
        System.out.println(rennen1.getData());
        rennen1.getDataTeilnehmer();
        
    }
}