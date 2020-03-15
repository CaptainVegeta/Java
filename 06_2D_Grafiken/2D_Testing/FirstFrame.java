/**
 * FirstFrame
 */
public class FirstFrame {

    public static void main(String[] args) {
       
        MyJFrame frame1 = new MyJFrame();
        frame1.setSize(300, 300);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(MyJFrame.EXIT_ON_CLOSE);
        frame1.setLocation(800, 400);
    }
}