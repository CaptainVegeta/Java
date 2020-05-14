import java.awt.event.KeyEvent;

/**
 * Keys
 */
public class Keys extends SimplifiedListener{

    public void keyPressed(KeyEvent e){
        int links  = e.getKeyCode();
        int rechts = e.getKeyCode();

        if(links == KeyEvent.VK_LEFT){
            GameContent.x_positionBar -= 10;
            Game.gameFrame.repaint();
        }
        else if(rechts == KeyEvent.VK_RIGHT){
            GameContent.x_positionBar += 10;
            Game.gameFrame.repaint();
        }
        else{
            // do nothing
        }

    }
}