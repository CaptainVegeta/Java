import java.awt.*;

/**
 * GameContent
 */
public class GameContent {

    public boolean getroffen = false;
    public int x_position = getRandom(50, 350);
    public int y_position = 40;
    public static int x_positionBar = 150;
    public int nMeteoriten = 5;

    public void gameSchleife(Graphics g){
            drawBar(g);
            for (int i = 0; i <= nMeteoriten; i++) {
                drawMeteroit(g);
            }
    }

    public void drawBar(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x_positionBar, 250, 20, 5);
    }


    public void drawMeteroit(Graphics g){
        g.setColor(Color.BLACK);
        x_position = getRandom(50, 350);
        g.fillOval(x_position, y_position, 10, 10);
    }

    public int getRandom(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}