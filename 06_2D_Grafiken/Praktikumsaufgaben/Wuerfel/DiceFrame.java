import java.awt.*;
import javax.swing.*;

/**
 * DiceFrame: Erbt von JFrame. Über den Konstruktor wird die Grösse und Sichtbarkeit des
Fensters gesetzt. Zudem wird Dice instanziiert. Besitzt die Methode paint(Graphics g).
 */
public class DiceFrame extends JFrame{

    public DiceFrame(){
        setVisible(true);
        setSize(220, 220);
        setLocation(700, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    Dice dice = new Dice();

    public void paint(Graphics g){
        dice.drawDice(g);
    }
}