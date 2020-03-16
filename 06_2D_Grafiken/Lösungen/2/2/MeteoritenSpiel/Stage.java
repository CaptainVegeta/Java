import javax.swing.*;
import java.awt.*;

public class Stage extends JFrame
{   
    public int screen_width = 800;
    public int screen_height = 600;
    public int meteorite_number = 9;
    public boolean alive = true;
    public Actor[] actors;      // Array was den Spieler und die Meteoriten festhält.
    
    public Stage(){
        setSize(800, 600);
        setVisible(true);
        actors = new Actor[meteorite_number + 1]; // Anzahl Meteoriten + Spieler
        Player player = new Player(20, screen_height - 30, screen_width);
        PlayerInput input = new PlayerInput(player);
        actors[0] = player;     // Player wird auf Index 0 gesetzt
        for(int i = 1; i < actors.length; i++){
            actors[i] = new Meteorite(screen_width, screen_height);
        }
        addKeyListener(input);
    }
    
    public void update(){
        if(alive){
            for(int i = 0; i < actors.length; i++){
                actors[i].act();
                if(i > 0){      // nur Meteoriten, kein Spieler
                    if(actors[i].y > actors[0].y && actors[i].x > actors[0].x && actors[i].x + actors[i].width < actors[0].x + actors[0].width){
                        alive = false;
                    }
                }
            }
        }
        repaint();
    }
    
    public void paint(Graphics g){
        if(alive){
            g.setColor(Color.WHITE);
        } else {
            g.setColor(Color.RED);
        }
        g.fillRect(0, 0, getWidth(), getHeight());
        for(int i = 0; i < actors.length; i++){
            actors[i].paint(g);
        }
    }
}