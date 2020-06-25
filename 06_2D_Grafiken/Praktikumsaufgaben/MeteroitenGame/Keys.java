import java.awt.event.KeyEvent;

/**
 * Keys
 */
public class Keys extends SimplifiedListener{

    public void keyPressed(KeyEvent e){
        int links  = e.getKeyCode();
        int rechts = e.getKeyCode();

        if(links == KeyEvent.VK_LEFT){
            Game.gameFrame.gameContent.x_positionBar -= 10;
        }
        else if(rechts == KeyEvent.VK_RIGHT){
            Game.gameFrame.gameContent.x_positionBar += 10;
        }
        else{
            // do nothing
        }

    }
}