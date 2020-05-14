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
        addKeyListener(new Keys());
    }

    GameContent gameContent = new GameContent();

    public void paint(Graphics g) {
        g.clearRect(GameContent.x_positionBar, 250, 20, 5);
        gameContent.gameSchleife(g);
    }
}
