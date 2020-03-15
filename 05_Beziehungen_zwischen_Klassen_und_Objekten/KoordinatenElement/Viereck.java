/**
 * Viereck
 */
public class Viereck extends KoordinatenElement{

    public float seite;

    public float mitteX(){
        float mitteX;
        // c^2 = a^2 + b^2
        // float hypotenuse = (float)Math.sqrt(seite*seite + seite*seite);
        mitteX = x + (seite / 2);
        return mitteX;
    }
}