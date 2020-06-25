import java.awt.*;

/**
 * GameContent
 */
public class GameContent{

    public boolean getroffen = false;
    public int x_position = getRandom(0, 400);
    public int y_position = 20;
    public int x_positionBar = 150;
    public int nMeteoriten = 10;
    public boolean zeichneMeteoriten = true;

    //Arrays um den x- & y-Standort eines Meteoriten zu speichern
    public int[] x_MeteoritenSpeicher = new int[nMeteoriten];
    public int[] y_MeteoritenSpeicher = new int[nMeteoriten];

    public void gameSchleife(Graphics g){
        //Zeichne Meteoriten 1x und bewege um 1 nach unten
        for (int i = 0; i < nMeteoriten; i++){
            if (zeichneMeteoriten) {
                drawMeteroit(g, i);
            }
            moveMeteorit(g, i);
        }
        zeichneMeteoriten = false;
    }

    public void drawBar(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(x_positionBar, 280, 20, 5);
    }

    public void drawMeteroit(Graphics g, int i){
        g.setColor(Color.BLACK);
        x_position = getRandom(0, 400);
        g.fillOval(x_position, y_position, 6, 6);

        //Speichere Standort in Arrays
        x_MeteoritenSpeicher[i] = x_position;
        y_MeteoritenSpeicher[i] = y_position;
    }

    public void moveMeteorit(Graphics g, int i){
        g.setColor(Color.BLACK);
        y_MeteoritenSpeicher[i] += 10;

        // Bewege alle Meteoriten nach unten
        for (int z = 0; z < x_MeteoritenSpeicher.length; z++) {
            // Prüfe ob Meteorit bereits vom Anfangswert abweicht
            if (y_MeteoritenSpeicher[z] != 20){

                // Überschreibe vorherigen Meteorit
                g.setColor(Color.GRAY);
                g.fillOval(x_MeteoritenSpeicher[z], y_MeteoritenSpeicher[z], 6, 6);

                y_MeteoritenSpeicher[z] += 10;

                // Zeichne neuen Meteorit
                g.setColor(Color.BLACK);
                g.fillOval(x_MeteoritenSpeicher[z], y_MeteoritenSpeicher[z], 6, 6);
            }
        }

        // Prüfe ob der Meteorit unten angekommen ist
        for (int y = 0; y < y_MeteoritenSpeicher.length; y++){
                if(y_MeteoritenSpeicher[y] > 300){

                    // Überschreibe vorherigen Meteorit
                    g.setColor(Color.GRAY);
                    g.fillOval(x_MeteoritenSpeicher[y], y_MeteoritenSpeicher[y], 6, 6);

                    y_MeteoritenSpeicher[y] = y_position;
                    x_MeteoritenSpeicher[y] = getRandom(0, 400);

                    // Zeichne neuen Meteorit
                    g.setColor(Color.BLACK);
                    g.fillOval(x_MeteoritenSpeicher[y], y_MeteoritenSpeicher[y], 6, 6);
                }
        }
    }

    public int getRandom(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}