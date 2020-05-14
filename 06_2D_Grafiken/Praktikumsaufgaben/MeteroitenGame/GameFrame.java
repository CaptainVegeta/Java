import java.awt.Graphics;
import javax.swing.JFrame;

/**
 * GameFrame
 */
public class GameFrame extends JFrame{

    public GameFrame(){
        setSize(400, 300);
        setLocation(800, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    GameContent gameContent = new GameContent();

    public void paint(Graphics g) {
        gameContent.gameSchleife(g);
    }
}
