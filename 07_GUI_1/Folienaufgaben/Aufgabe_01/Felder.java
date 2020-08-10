import javax.swing.*;
import java.awt.*;

public class Felder{

    // GUI components
    public static JButton erweiternButton;
    public static JButton löschenButton;
    public static JTextField textField;

    public Felder(){

        erweiternButton = new JButton("Erweitern");
        löschenButton   = new JButton("Löschen");
        textField    = new JTextField("Hallo Welt");

        // Panel holding the GUI components
        JPanel myPanel = new JPanel(new FlowLayout());
        myPanel.add(erweiternButton);
        myPanel.add(textField);
        myPanel.add(löschenButton);

        // Create window holding panel
        JFrame myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setContentPane(myPanel);
        myFrame.setVisible(true);
        myFrame.setSize(300, 200);

        // Add Listener for performing actions to buttons. 
        // Give String to constructor of ActionPerformer to distinguish wich button was pressed.
        erweiternButton.addActionListener(new ActionErweitern());
        löschenButton.addActionListener(new ActionLoeschen());
    }


}