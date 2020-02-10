import java.util.Scanner;

public class Lehrer {
    public static void main(String[] args) {
        System.out.println("Geben Sie bitte eine ganzzahlige Zahl zur Berechnung an: ");
        int input = new Scanner(System.in).nextInt();

        int result = input;
        for (int i = 1; i < result; i++) {
            if(input % i == 0){
                result = input / i;
                if(i < result){                              //braucht es bei einigen Zahlen; Bsp: 100
                    System.out.println("= "+i+" * "+result);
                }
            }
        }
        Potenzen();
    }

    public static void Potenzen(){
        System.out.println();
        System.out.println();
        System.out.println("Geben Sie bitte eine ganzzahlige Zahl zur Berechnung aller Potenzen an: ");

        int input = new Scanner(System.in).nextInt();
        int rest  = input;

        for(int i = 2; i < input; i++){
            // teste ob teilbar durch i
            if(input % i == 0){
                // teile durch i
                for(int e = 1; e < input; e++){
                    int rest_test = rest;
                    rest = rest / i;
                    //stoppe falls es einen Rest gibt (Input ungerade Zahl)
                    if(rest_test % i != 0){
                        break;
                    }      
                    //stoppe sobald Resultat 1 ist und gib e als Potenz aus
                    if(rest == 1){
                        System.out.println(input+" = "+i+"^"+e);
                        break;
                    }                    
                }
            }
            //setze rest wieder zurück für i+1
            rest = input;    
        }
    }
}