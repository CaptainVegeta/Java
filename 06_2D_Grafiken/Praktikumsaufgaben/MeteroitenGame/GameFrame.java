import java.awt.Color;
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
        setTitle("MeteoritenGame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(new Keys());
    }

    GameContent gameContent = new GameContent();

    public void paint(Graphics g){
            g.setColor(Color.GRAY);
            g.fillRect(0, 0, 400, 300);
            gameContent.drawBar(g);
            gameContent.gameSchleife(g);
    }
}