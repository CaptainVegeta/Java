/**
 * Game
 */
public class Game {

    public static GameFrame gameFrame;

    public static void main(String[] args) {
        gameFrame = new GameFrame();
        schleifen();
    }

    public static void schleifen(){
        boolean ablaufTest = true;
        while(ablaufTest){
            for (int i = 0; i < 20; i++) {
                Game.gameFrame.repaint();
                SimplifiedDelay.delay(1500);
                
            }
            ablaufTest = false;
        }
    }
}