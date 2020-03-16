import java.awt.*;

public class Dice
{
    public int width = 100;
    public int height = 100;
    public int arc = 30;
    public int dot_size = 15;

    public int dice_number = 0;
    public int x;
    public int y;
    
    public Dice(int position_x, int position_y){
        x = position_x;
        y = position_y;
    }
    
    public void drawDice(Graphics g){
        drawBody(g);
        drawDots(g, dice_number);
    }
    
    public void drawBody(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRoundRect(x, y, width, height, arc, arc);
    }
    
    public int getRandom(int min, int max){
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    
    public void rollDice(){
        dice_number = getRandom(1, 6);
    }
    
    public void drawDots(Graphics g, int number){
        g.setColor(Color.BLACK);
        int middle_x = x + width / 2 - dot_size / 2;
        int middle_y = y + height / 2 - dot_size / 2;
        int shift = 0;
        switch(number){
            case 1:
                g.fillOval(middle_x, middle_y, dot_size, dot_size);
                break;
            case 2:
                shift = width / 5;
                g.fillOval(middle_x - shift, middle_y - shift, dot_size, dot_size);
                g.fillOval(middle_x + shift, middle_y + shift, dot_size, dot_size);
                break;
            case 3:
                shift = width / 4;
                g.fillOval(middle_x - shift, middle_y - shift, dot_size, dot_size);
                g.fillOval(middle_x, middle_y, dot_size, dot_size);
                g.fillOval(middle_x + shift, middle_y + shift, dot_size, dot_size);
                break;
            case 4:
                shift = width / 4;
                g.fillOval(middle_x - shift, middle_y - shift, dot_size, dot_size);
                g.fillOval(middle_x - shift, middle_y + shift, dot_size, dot_size);
                g.fillOval(middle_x + shift, middle_y + shift, dot_size, dot_size);
                g.fillOval(middle_x + shift, middle_y - shift, dot_size, dot_size);
                break;
            case 5:
                shift = width / 4;
                g.fillOval(middle_x - shift, middle_y - shift, dot_size, dot_size);
                g.fillOval(middle_x - shift, middle_y + shift, dot_size, dot_size);
                g.fillOval(middle_x, middle_y, dot_size, dot_size);
                g.fillOval(middle_x + shift, middle_y + shift, dot_size, dot_size);
                g.fillOval(middle_x + shift, middle_y - shift, dot_size, dot_size);
                break;
            case 6:
                shift = width / 4;
                g.fillOval(middle_x - shift, middle_y - shift, dot_size, dot_size);
                g.fillOval(middle_x - shift, middle_y + shift, dot_size, dot_size);
                g.fillOval(middle_x - shift, middle_y, dot_size, dot_size);
                g.fillOval(middle_x + shift, middle_y, dot_size, dot_size);
                g.fillOval(middle_x + shift, middle_y + shift, dot_size, dot_size);
                g.fillOval(middle_x + shift, middle_y - shift, dot_size, dot_size);
                break;
        }
    }
}
