import javax.swing.*;
import java.awt.*;

public class Player extends Actor
{
    public int moving_speed = 30;
    public int max_x;
    
    public Player(int new_x, int new_y, int new_max_x){
        x = new_x;
        y = new_y;
        width = 100;
        height = 10;
        max_x = new_max_x;
    }
    
    // wird aus Actor überschrieben
    public void act(){
        
    }
    
    // wird aus Actor überschrieben
    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect((int)x, (int)y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect((int)x, (int)y, width, height);
    }
    
    public void moveLeft(){
        if(x > 0){
            x = x - moving_speed;
        }
    }
    
    public void moveRight(){
        if(x < max_x){
            x = x + moving_speed;
        }
    }
}
