/**
 * Battery
 */
public class Battery {

    public static int charge = 60;

    public static boolean use(){
        charge -= 10;
        if (charge > 0) {
            return true;
        } else {
            return false;
        }
    }
}