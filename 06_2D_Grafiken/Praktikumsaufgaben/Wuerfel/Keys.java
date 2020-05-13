import java.awt.event.KeyEvent;

/**
 * Keys
 */
public class Keys extends SimplifiedListener {

    public void keyReleased(KeyEvent e){
        int space = e.getKeyCode();
        System.out.println(space);

        if (space == KeyEvent.VK_SPACE) {
            DiceGame.diceFrame.dice.rollDice();
            DiceGame.diceFrame.repaint();
        }
    }
}