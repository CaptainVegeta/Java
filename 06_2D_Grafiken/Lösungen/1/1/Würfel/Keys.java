import java.awt.event.*;

public class Keys extends SimplifiedListener
{   
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            DiceGame.frame.dice.rollDice();
            DiceGame.frame.repaint();
        }
    }
}
