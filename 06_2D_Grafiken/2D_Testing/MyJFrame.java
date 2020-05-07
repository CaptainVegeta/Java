import javax.swing.*;
import java.awt.*;

/**
 * MyJFrame
 */
public class MyJFrame extends JFrame{

    public void paint(Graphics g){
        g.drawOval(110,  50,  60,  60);
        g.drawLine(140, 110, 140, 210); //Strich nach unten
        g.drawLine(140, 150,  90, 120); //Arm nach links
        g.drawLine(140, 150, 190, 120); //Arm nach rechts
    }
}