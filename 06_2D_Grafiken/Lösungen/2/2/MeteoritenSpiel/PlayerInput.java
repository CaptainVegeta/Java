import java.awt.event.*;

public class PlayerInput extends SimplifiedListener
{
    public Player player;
    
    public PlayerInput(Player new_player){
        player = new_player; // Bei Objekten wird nur die Referenz (Link) übergeben
    }
    
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            player.moveLeft();
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            player.moveRight();
        }
    }
}
