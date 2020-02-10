public class Aufgabe03{

    public static void arraySort(){
        System.out.println("Sie haben Aufgabe 3 gewählt:");
        int[] vorgabe = {100, 5, 3, 7, 6, 1, 99, 10, 2, 14, 1, 6, 8, 11};

        //Ausgabe des unsortierten Arrays
        for(int i = 0; i < vorgabe.length; i++){
            System.out.print(vorgabe[i]+" ");
        }

        System.out.println();
        
        //sortiere das Array
        for(int i = 0; i <= vorgabe.length-2; i++){
            int e = i + 1; //damit die 2. Stelle des Array verglichen wird
            while(vorgabe[i] > vorgabe[e]){
                e = 1;
                for(i = 0; i <= vorgabe.length-2; i++){
                    if(vorgabe[i] > vorgabe[e]){
                        int placeholder = vorgabe[e];
                        vorgabe[e] = vorgabe[i];
                        vorgabe[i] = placeholder;
                    }
                    e = e + 1;
                }
                i = 0;
                e = i + 1;
            }
        }

        //Ausgabe des sortierten Arrays
        for(int i = 0; i < vorgabe.length; i++)
            System.out.print(vorgabe[i]+" ");
    }
}