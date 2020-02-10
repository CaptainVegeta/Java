public class Aufgabe_01{

    public static int fibonacci(int anfangs_Zahl){
        // 0 1 1 2 3 5 8 13 21
        int zahl_an_Stelle_0 = 0;
        int zahl_an_Stelle_1 = 1;
        int zahl_an_Stelle_x = 0;

        for(int i = 1; i < anfangs_Zahl; i++){
            zahl_an_Stelle_x = zahl_an_Stelle_0 + zahl_an_Stelle_1;

            zahl_an_Stelle_0 = zahl_an_Stelle_1;
            zahl_an_Stelle_1 = zahl_an_Stelle_x;
        }
        return zahl_an_Stelle_x;
    }
}