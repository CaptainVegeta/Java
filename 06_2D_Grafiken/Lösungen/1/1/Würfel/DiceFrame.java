import javax.swing.*;
import java.awt.*;

public class DiceFrame extends JFrame
{
    public Dice dice;
    
    public DiceFrame(){
        dice = new Dice(20, 40);
        dice.rollDice();
        setSize(120, 150);
        setVisible(true);
        addKeyListener(new Keys());
        setLocation(800, 400);
    }
    
    public void paint(Graphics g){
        dice.drawDice(g);
    }
}
