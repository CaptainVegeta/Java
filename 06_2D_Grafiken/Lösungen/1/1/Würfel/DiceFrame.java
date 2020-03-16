import javax.swing.*;
import java.awt.*;

public class DiceFrame extends JFrame
{
    public Dice dice;
    
    public DiceFrame(){
        dice = new Dice(10, 10);
        dice.rollDice();
        setSize(120, 120);
        setVisible(true);
        addKeyListener(new Keys());
        setLocation(800, 400);
    }
    
    public void paint(Graphics g){
        dice.drawDice(g);
    }
}
