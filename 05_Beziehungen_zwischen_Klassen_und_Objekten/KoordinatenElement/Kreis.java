/**
 * Kreis
 */
public class Kreis extends KoordinatenElement{

    public float radius;

    //Kreisformel: x2+y2=r2
    public float maxX() {
        float maxX;
        maxX = x + radius;
        return maxX;
    }
}