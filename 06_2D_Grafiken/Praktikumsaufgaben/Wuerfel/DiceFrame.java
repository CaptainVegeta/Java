import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * DiceFrame: Erbt von JFrame. Über den Konstruktor wird die Grösse und Sichtbarkeit des
Fensters gesetzt. Zudem wird Dice instanziiert. Besitzt die Methode paint(Graphics g).
 */
public class DiceFrame extends JFrame{

    public DiceFrame(){
        JFrame diceFrame = new JFrame("Würfel");
        diceFrame.setVisible(true);
        diceFrame.setSize(220, 220);
        diceFrame.setLocation(700, 300);
        diceFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Zudem wird Dice instanziiert.
        Dice dice = new Dice();
    }

    public void paint(Graphics g) {
        g.drawRect(20, 20, 40, 40);
    }
}