public class Aufgabe_02{

    public static int fibonacci(int anfangs_Zahl){
        // 0 1 1 2 3 5 8 13 21
        int zahl_an_Stelle_x = 0;

        if(anfangs_Zahl == 0){
            return 0;
        }
        else if(anfangs_Zahl == 1){
            return 1;
        }
        else{
            zahl_an_Stelle_x = fibonacci(anfangs_Zahl-1)+fibonacci(anfangs_Zahl-2);
            return zahl_an_Stelle_x;
        }
    }    
}