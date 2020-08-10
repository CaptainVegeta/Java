import javax.swing.*;
import java.awt.*;

public class Felder{

    // GUI components
    JButton erweiternButton = new JButton("Erweitern");
    JButton löschenButton   = new JButton("Hallo Welt");
    JTextField textField    = new JTextField("Löschen");

    public Felder(){

        // Panel holding the GUI components
        JPanel myPanel = new JPanel(new FlowLayout());
        myPanel.add(erweiternButton);
        myPanel.add(löschenButton);
        myPanel.add(textField);

        // Create window holding panel
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setContentPane(myPanel);
        myFrame.setVisible(true);
        myFrame.setSize(300, 200);
    }


}