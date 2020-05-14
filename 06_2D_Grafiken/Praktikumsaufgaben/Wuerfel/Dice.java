import java.awt.*;

/**
 * Dice: Über den Konstruktor wird die Position des Würfels gesetzt. Besitzt mehrere
Methoden um den Würfel zu zeichnen.
 */
public class Dice {

    public int x_Abstand = 20;
    public int y_Abstand = 40;
    public int wuerfelGroesse = 100;
    public int punktGroesse = 20;
    public int number = 0;

    public Dice(){
        rollDice();
        System.out.println(number);
    }

    public void drawDice(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x_Abstand, y_Abstand, wuerfelGroesse, wuerfelGroesse);
        drawBody(g);
        drawDots(g, number);
    }

    public void drawBody(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(x_Abstand, y_Abstand, wuerfelGroesse, wuerfelGroesse);
    }

    public void drawDots(Graphics g, int number){
        g.setColor(Color.RED);
        switch (number){
            case 1:
                g.fillOval(x_Abstand + wuerfelGroesse/2 - punktGroesse/2, y_Abstand + wuerfelGroesse/2 - punktGroesse/2,
                punktGroesse, punktGroesse);
                break;
            case 2:
                g.fillOval(x_Abstand + wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/2 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/2 - punktGroesse/2,
                punktGroesse, punktGroesse);
                break;
            case 3:
                g.fillOval(x_Abstand + wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/2 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + wuerfelGroesse/2 - punktGroesse/2, y_Abstand + wuerfelGroesse/2 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/2 - punktGroesse/2,
                punktGroesse, punktGroesse);
                break;
            case 4:
                g.fillOval(x_Abstand + wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + wuerfelGroesse/4 - punktGroesse/2, y_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2, y_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                break;
            case 5:
                g.fillOval(x_Abstand + wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + wuerfelGroesse/4 - punktGroesse/2, y_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2, y_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + wuerfelGroesse/2 - punktGroesse/2, y_Abstand + wuerfelGroesse/2 - punktGroesse/2,
                punktGroesse, punktGroesse);
            break;
            case 6:
                g.fillOval(x_Abstand + wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2, y_Abstand + wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + wuerfelGroesse/4 - punktGroesse/2, y_Abstand + 2*wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2, y_Abstand + 2*wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + wuerfelGroesse/4 - punktGroesse/2, y_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
                g.fillOval(x_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2, y_Abstand + 3*wuerfelGroesse/4 - punktGroesse/2,
                punktGroesse, punktGroesse);
            break;    
            default:
                break;
        }
    }

    public void rollDice(){
        number = getRandom(1, 6);
    }

    public int getRandom(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}