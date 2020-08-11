import javax.swing.*;
import java.awt.*;

public class Felder {
    
    // GUI components
    public static JButton plus;
    public static JButton minus;
    public static JButton multiply;
    public static JButton division;
    public static JButton clear;
    
    public static JTextField operand1;
    public static JTextField operand2;

    public static JTextArea results;

    public Felder(){

        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("*");
        division = new JButton("/");
        clear = new JButton("clr");

        operand1 = new JTextField();
        operand1.setPreferredSize(new Dimension(150, 25));
        operand2 = new JTextField();
        operand2.setPreferredSize(new Dimension(150, 25));

        results = new JTextArea();
        results.setPreferredSize(new Dimension(300, 200));
        results.setEditable(false);

        // Panel holding the buttons
        JPanel panel1 = new JPanel();
        panel1.add(plus);
        panel1.add(minus);
        panel1.add(multiply);
        panel1.add(division);
        panel1.add(clear);

        // Panel holding the  text fields
        JPanel panel2 = new JPanel();
        panel2.add(operand1);
        panel2.add(operand2);

        // Panel holding the results
        JPanel panel3 = new JPanel();
        panel3.add(results);

        // Main panel holding all other panels
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);

        // Create window holding mainPnel
        JFrame frame = new JFrame();
        frame.setSize(310, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.setVisible(true);
        frame.setSize(300, 200);
        frame.pack();
    }

}