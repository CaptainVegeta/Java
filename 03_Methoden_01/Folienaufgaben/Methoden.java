public class Methoden{
    public static void main(String[] args) {
        int intArrray1 [] = {1,2,3,4,5};
        int intArrray2 [] = {6,7,8,9,10,11,12};

        float floatArrray1 [] = {1,1,2,2,3,3,4,4,5,5};
        float floatArrray2 [] = {6,6,7,7,8,8,9,9,10,10,11,11,12,12,13,13};

        arrayReader(intArrray1);
        arrayReader(intArrray2);

        arrayReader(floatArrray1);
        arrayReader(floatArrray2);

    }

    public static void arrayReader(int einArray []){
        for(int i = 0; i < einArray.length; i++){
            System.out.println(einArray[i]);
        }
        System.out.println("-------------------------------");
    }
    
    public static void arrayReader(float einArray []){
        for(int i = 0; i < einArray.length; i++){
            System.out.println(einArray[i]);
        }
        System.out.println("-------------------------------");
    }
}