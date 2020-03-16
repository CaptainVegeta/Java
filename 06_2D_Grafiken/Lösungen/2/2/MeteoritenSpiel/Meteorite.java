import javax.swing.*;
import java.awt.*;

public class Meteorite extends Actor
{
    public float falling_speed = 2f;
    public int max_x;
    public int max_y;
    
    public Meteorite(int new_max_x, int new_max_y){
        x = getRandom(0, new_max_x);
        y = getRandom(-height, -1000);
        width = 10;
        height = 10;
        max_x = new_max_x;
        max_y = new_max_y;
    }
    
    // wird aus Actor überschrieben
    public void act(){
        y = y + falling_speed;
        if(y > max_y){
            y = -height;
            x = getRandom(0, max_x);
        }
    }
    
    // wird aus Actor überschrieben
    public void paint(Graphics g){
        g.setColor(Color.DARK_GRAY);
        g.fillOval((int)x, (int)y, width, height);
        g.setColor(Color.BLACK);
        g.drawOval((int)x, (int)y, width, height);
    }
    
    public int getRandom(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}
