public class Aufgabe01{
    
    public static void einMalEins(){
        System.out.println("Starte nun 1x1:");

        for(int i = 1; i <= 10; i++){
            for(int e = 1; e <= 10; e++){
            int resultat = i * e;
            System.out.println(i+" x "+e+" = "+resultat);
            }
        }
    }
}