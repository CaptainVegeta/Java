public class Aufgabe_04
{
    public static void main(String[] args){
        int[] test_richtig = {1640, 1884, 2060, 1404, 2020, 1648, 2072, 1504};
        int[] test_falsch = {1700, 1800, 1900, 1402, 1406, 2018, 2294};
        
        for(int i = 0; i < test_richtig.length; i++){
            System.out.print("teste Schaltjahr " + test_richtig[i] + ": ");
            if(isLeapYear(test_richtig[i])){
                System.out.println("richtig");
            } else {
                System.out.println("falsch");
            }
        }
        
        for(int i = 0; i < test_falsch.length; i++){
            System.out.print("teste kein Schaltjahr " + test_falsch[i] + ": ");
            if(!isLeapYear(test_falsch[i])){
                System.out.println("richtig");
            } else {
                System.out.println("falsch");
            }
        }
    }
    public static void isLeapYear(){
        
    }
}
